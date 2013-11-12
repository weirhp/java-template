/*
 * $RCSfile: ClassCompiler.java,v $$
 * $Revision: 1.1 $
 * $Date: 2013-11-8 $
 *
 * Copyright (C) 2008 WanMei, Inc. All rights reserved.
 *
 * This software is the proprietary information of WanMei, Inc.
 * Use is subject to license terms.
 */
package com.skin.ayada.compile;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

import com.skin.ayada.jstl.TagLibrary;
import com.skin.ayada.jstl.TagLibraryFactory;
import com.skin.ayada.statement.Node;
import com.skin.ayada.statement.NodeType;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.template.Template;
import com.skin.ayada.util.ClassUtil;
import com.skin.ayada.util.NodeUtil;

/**
 * <p>Title: ClassCompiler</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @version 1.0
 */
public class JspCompiler
{
    public String compile(Template template, String className, String packageName)
    {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        writer.println("/*");
        writer.println(" * $RCSfile: " + className + ".java,v $$");
        writer.println(" * $Revision: 1.1 $");
        writer.println(" * $Date: 2013-11-8 $");
        writer.println(" *");
        writer.println(" * Copyright (C) 2008 Skin, Inc. All rights reserved.");
        writer.println(" *");
        writer.println(" * This software is the proprietary information of Skin, Inc.");
        writer.println(" * Use is subject to license terms.");
        writer.println(" */");
        writer.println("package " + packageName + ";");
        writer.println();
        writer.println("import java.io.IOException;");
        writer.println();
        writer.println("import com.skin.ayada.runtime.ExpressionContext;");
        writer.println("import com.skin.ayada.runtime.JspWriter;");
        writer.println("import com.skin.ayada.runtime.PageContext;");
        writer.println("import com.skin.ayada.tagext.BodyContent;");
        writer.println("import com.skin.ayada.tagext.Tag;");
        writer.println("import com.skin.ayada.tagext.IterationTag;");
        writer.println("import com.skin.ayada.template.TemplateHandler;");
        writer.println("import com.skin.ayada.util.ExpressionUtil;");
        writer.println();
        writer.println("public class " + className + " extends TemplateHandler");
        writer.println("{");

        Node node = null;
        String indent = "        ";
        List<Node> list = template.getNodes();
        TagLibrary tagLibrary = TagLibraryFactory.getStandardTagLibrary();

        for(int index = 0, size = list.size(); index < size; index++)
        {
            node = list.get(index);

            if(node.getNodeType() == NodeType.TEXT)
            {
                continue;
            }

            if(node.getNodeType() == NodeType.EXPRESSION)
            {
                continue;
            }

            if(node.getOffset() == index)
            {
                if(node.getNodeType() == NodeType.JSP_DECLARATION)
                {
                    writer.println("    /* JSP_DECLARATION: lineNumber: " + node.getLineNumber() + " */");
                    writer.println(node.toString());
                    continue;
                }

                if(node.getNodeName().equals("t:import"))
                {
                    String name = node.getAttribute("name");
                    String tagClassName = node.getAttribute("className");
                    tagLibrary.setup(name, tagClassName);
                }
            }
        }

        writer.println("    /**");
        writer.println("     * @param pageContext");
        writer.println("     * @throws IOException");
        writer.println("     */");
        writer.println("    public void execute(PageContext pageContext) throws java.io.IOException");
        writer.println("    {");
        writer.println("        int EVAL_BODY_AGAIN = IterationTag.EVAL_BODY_AGAIN;");
        writer.println("        JspWriter out = pageContext.getOut();");
        writer.println("        ExpressionContext expressionContext = pageContext.getExpressionContext();");
        writer.println();

        for(int index = 0, size = list.size(); index < size; index++)
        {
            node = list.get(index);

            if(node.getNodeType() == NodeType.TEXT)
            {
                writer.println(indent + "/* TEXT: lineNumber: " + node.getLineNumber() + " */");
                writer.println(indent + "out.write(\"" + this.escape(node.toString()) + "\");");
                continue;
            }

            if(node.getNodeType() == NodeType.EXPRESSION)
            {
                writer.println(indent + "/* EXPRESSION: lineNumber: " + node.getLineNumber() + " */");
                writer.println(indent + "out.write(expressionContext.getString(\"" + this.escape(node.toString()) + "\"));");
                continue;
            }

            if(node.getLength() == 0)
            {
                throw new RuntimeException("Exception at line # " + node.getLineNumber() + " " + NodeUtil.toString(node) + " not match !");
            }

            Node parent = node.getParent();
            String tagName = node.getNodeName();
            String flagName = this.getVariableName(node, "_tag_flag_");
            String tagClassName = tagLibrary.getTagClassName(tagName);
            String tagInstanceName = this.getVariableName(node, "_tag_instance_");
            String parentInstanceName = this.getVariableName(parent, "_tag_instance_");
            String bodyContentInstanceName = this.getVariableName(node, "_body_content_");

            if(node.getOffset() == index)
            {
                if(node.getNodeType() == NodeType.JSP_DECLARATION)
                {
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_PAGE)
                {
                    // TODO: 
                    writer.println(indent + "/* JSP_DIRECTIVE: lineNumber: " + node.getLineNumber() + " */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_TAGLIB)
                {
                    // TODO: 
                    writer.println(indent + "/* JSP_DIRECTIVE: lineNumber: " + node.getLineNumber() + " */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_INCLUDE)
                {
                    // TODO: 
                    writer.println(indent + "/* JSP_DIRECTIVE: lineNumber: " + node.getLineNumber() + " */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_SCRIPTLET)
                {
                    writer.println(indent + "/* JSP_SCRIPTLET: lineNumber: " + node.getLineNumber() + " */");
                    writer.println(node.toString());
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_EXPRESSION)
                {
                    writer.println(indent + "/* JSP_EXPRESSION: lineNumber: " + node.getLineNumber() + " */");
                    writer.println(indent + "out.write(" + node.toString() + ");");
                    continue;
                }

                writer.println();
                writer.println(indent + "/* NODE START: lineNumber: " + node.getLineNumber() + ", offset: " + node.getOffset() + ", length: " + node.getLength() + ", tagClassName: " + tagClassName + ", tagInstanceName: " + tagInstanceName + " */");
                writer.println(indent + "/* " + NodeUtil.toString(node) + " */");

                if(node.getNodeName().equals("t:import"))
                {
                    writer.println(indent + "pageContext.getTagLibrary().setup(\"" + node.getAttribute("name") + "\", \"" + node.getAttribute("className") + "\");");
                }
                else if(tagName.equals("c:if"))
                {
                    writer.println(indent + "if(ExpressionUtil.getBoolean(expressionContext, \"" + this.escape(node.getAttribute("test")) + "\")){");
                }
                else if(tagName.equals("c:set"))
                {
                    String name = node.getAttribute("var");
                    writer.println(indent + "pageContext.setAttribute(\"" + name + "\", ExpressionUtil.evaluate(expressionContext, \"" + this.escape(node.getAttribute("value")) + "\"));");
                }
                else if(tagName.equals("c:out"))
                {
                    boolean escapeXml = "true".equals(node.getAttribute("escapeXml"));
                    
                    if(node.getLength() > 2)
                    {
                        writer.println(indent + "out = pageContext.pushBody();");
                    }

                    if(node.getAttribute("value") != null)
                    {
                        if(escapeXml)
                        {
                            writer.println(indent + "out.write(ExpressionUtil.getHtml(expressionContext, \"" + this.escape(node.getAttribute("value")) + "\"));");
                        }
                        else
                        {
                            writer.println(indent + "out.write(ExpressionUtil.getString(expressionContext, \"" + this.escape(node.getAttribute("value")) + "\"));");
                        }
                    }
                }
                else if(tagName.equals("c:each") || tagName.equals("c:forEach"))
                {
                    String items = node.getAttribute("items");
                    String variable = node.getAttribute("var");
                    writer.println(indent + tagClassName + " " + tagInstanceName + " = new " + tagClassName + "();");
                    writer.println();

                    if(parent != null)
                    {
                        writer.println(indent + tagInstanceName + ".setParent(" + parentInstanceName + ");");
                    }
                    else
                    {
                        writer.println(indent + tagInstanceName + ".setParent((Tag)null);");
                    }

                    writer.println(indent + tagInstanceName + ".setPageContext(pageContext);");

                    if(items != null)
                    {
                        writer.println(indent + tagInstanceName + ".setItems(ExpressionUtil.evaluate(expressionContext, \"" + this.escape(items) + "\"));");
                    }

                    if(node.getAttribute("begin") != null)
                    {
                        writer.println(indent + tagInstanceName + ".setBegin(ExpressionUtil.getInteger(expressionContext, \"" + node.getAttribute("begin") + "\"));");
                    }

                    if(node.getAttribute("step") != null)
                    {
                        writer.println(indent + tagInstanceName + ".setStep(ExpressionUtil.getInteger(expressionContext, \"" + node.getAttribute("step") + "\"));");
                    }

                    if(node.getAttribute("end") != null)
                    {
                        writer.println(indent + tagInstanceName + ".setEnd(ExpressionUtil.getInteger(expressionContext, \"" + node.getAttribute("end") + "\"));");
                    }

                    if(node.getAttribute("varStatus") != null)
                    {
                        writer.println(indent + "pageContext.setAttribute(\"" + node.getAttribute("varStatus") + "\", " + tagInstanceName + ".getLoopTagStatus());");
                    }

                    if(variable != null)
                    {
                        // writer.write("var " + tagInfo.tempObjectName+ " = pageContext.getAttribute(\"" + variable + "\");");
                    }

                    writer.println(indent + tagInstanceName + ".doStartTag();");
                    writer.println(indent + "while(" + tagInstanceName + ".hasNext()){");
                    writer.println(indent + "    pageContext.setAttribute(\"" + variable + "\", " + tagInstanceName + ".next());");
                }
                else if(tagName.equals("c:choose"))
                {
                    writer.println(indent + tagClassName + " " + tagInstanceName + " = new " + tagClassName + "();");

                    if(parent != null)
                    {
                        writer.println(indent + tagInstanceName + ".setParent(" + parentInstanceName + ");");
                    }
                    else
                    {
                        writer.println(indent + tagInstanceName + ".setParent((Tag)null);");
                    }

                    writer.println(indent + tagInstanceName + ".setPageContext(pageContext);");
                    writer.println();
                }
                else if(tagName.equals("c:when"))
                {
                    writer.println(indent + "if(" + parentInstanceName + ".complete() == false && ExpressionUtil.getBoolean(expressionContext, \"" + this.escape(node.getAttribute("test")) + "\")){");
                    writer.println(indent + "    " + parentInstanceName + ".finish();");
                }
                else if(tagName.equals("c:otherwise"))
                {
                    writer.println(indent + "if(" + parentInstanceName + ".complete() == false){");
                    writer.println(indent + "    " + parentInstanceName + ".finish();");
                }
                else
                {
                    writer.println(indent + tagClassName + " " + tagInstanceName + " = new " + tagClassName + "();");

                    if(parent != null)
                    {
                        writer.println(indent + tagInstanceName + ".setParent(" + parentInstanceName + ");");
                    }
                    else
                    {
                        writer.println(indent + tagInstanceName + ".setParent((Tag)null);");
                    }

                    writer.println(indent + tagInstanceName + ".setPageContext(pageContext);");
                    this.setAttributes(tagClassName, node.getAttributes(), tagInstanceName, writer);
                    writer.println(indent + "int " + flagName + " = " + tagInstanceName + ".doStartTag();");
                    writer.println();

                    writer.println(indent + "if(" + flagName + " == Tag.SKIP_PAGE){");
                    writer.println(indent + "    return;");
                    writer.println(indent + "}");

                    if(this.isAssignableFrom(tagClassName, BodyTag.class))
                    {
                        writer.println(indent + "if(" + flagName + " != Tag.SKIP_BODY){");
                        writer.println(indent + "    if(" + flagName + " != Tag.EVAL_BODY_INCLUDE){");
                        writer.println(indent + "       BodyContent " + bodyContentInstanceName + " = (BodyContent)(pageContext.pushBody());");
                        writer.println(indent + "       " + tagInstanceName + ".setBodyContent(" + bodyContentInstanceName + ");");
                        writer.println(indent + "       " + tagInstanceName + ".doInitBody();");
                        writer.println(indent + "       out = " + bodyContentInstanceName + ";");
                        writer.println(indent + "    }");
                        writer.println(indent + "}");
                    }

                    writer.println(indent + "while(true){");
                }
            }
            else
            {
                /* jsp tag support */
                if(node.getNodeType() == NodeType.JSP_DECLARATION)
                {
                    writer.println(indent + "/* jsp:declaration END */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_PAGE)
                {
                    writer.println(indent + "/* jsp:directive.page END */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_TAGLIB)
                {
                    writer.println(indent + "/* jsp:directive.taglib END */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_DIRECTIVE_INCLUDE)
                {
                    writer.println(indent + "/* jsp:directive.include END */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_SCRIPTLET)
                {
                    writer.println(indent + "/* jsp:scriptlet END */");
                    continue;
                }

                if(node.getNodeType() == NodeType.JSP_EXPRESSION)
                {
                    writer.println(indent + "/* jsp:expression END */");
                    continue;
                }
                
                /* jstl tag support */
                if(node.getNodeName().equals("t:import"))
                {
                    writer.println(indent + "/* jsp.jstl.core.ImportTag END */");
                }
                else if(tagName.equals("c:if"))
                {
                    writer.println(indent + "} /* jsp.jstl.core.IfTag END */");
                }
                else if(tagName.equals("c:set"))
                {
                    writer.println(indent + "/* jsp.jstl.core.SetTag END */");
                }
                else if(tagName.equals("c:out"))
                {
                    if(node.getLength() > 2)
                    {
                        boolean escapeXml = "true".equals(node.getAttribute("escapeXml"));
                        writer.println(indent + "pageContext.printBodyContent((BodyContent)out, " + escapeXml + ");");
                        writer.println(indent + "out = pageContext.popBody();");
                    }

                    writer.println(indent + "/* jsp.jstl.core.OutTag END */");
                }
                else if(tagName.equals("c:each") || tagName.equals("c:forEach"))
                {
                    writer.println(indent + "}");
                    writer.println(indent + tagInstanceName + ".release();");
                    writer.println(indent + "/* jsp.jstl.core.ForEachTag END */");
                }
                else if(tagName.equals("c:choose"))
                {
                    writer.println(indent + tagInstanceName + ".release();");
                    writer.println(indent + "/* jsp.jstl.core.ChooseTag END */");
                }
                else if(tagName.equals("c:when"))
                {
                    writer.println(indent + "} /* jsp.jstl.core.WhenTag END */");
                }
                else if(tagName.equals("c:otherwise"))
                {
                    writer.println(indent + "} /* jsp.jstl.core.OtherwiseTag END */");
                }
                else
                {
                    if(this.isAssignableFrom(tagClassName, IterationTag.class))
                    {
                        writer.println(indent + "    " + flagName + " = " + tagInstanceName + ".doAfterBody();");
                    }

                    writer.println(indent + "    if(" + flagName + " != EVAL_BODY_AGAIN){");
                    writer.println(indent + "        break;");
                    writer.println(indent + "    }");
                    writer.println(indent + "}");
                    writer.println(indent + tagInstanceName+ ".doEndTag();");
                    writer.println(indent + tagInstanceName + ".release();");

                    if(this.isAssignableFrom(tagClassName, BodyTag.class))
                    {
                        writer.println(indent + "out = pageContext.popBody();");
                    }
                }

                writer.println(indent + "/* NODE END: lineNumber: " + node.getLineNumber() + ", tagClassName: " + tagClassName + ", tagInstanceName: " + tagInstanceName + " */");
                writer.println();
            }
        }

        writer.println("        out.flush();");
        writer.println("    }");
        writer.println("}");
        writer.flush();
        return stringWriter.toString();
    }

    /**
     * @param tagClassName
     * @param attributes
     */
    public void setAttributes(String tagClassName, Map<String, String> attributes, String tagInstanceName, PrintWriter writer)
    {
        if(attributes == null || attributes.size() < 1)
        {
            return;
        }

        try
        {
            Class<?> clazz = ClassUtil.getClass(tagClassName);

            for(Map.Entry<String, String> entry : attributes.entrySet())
            {
                String name = entry.getKey();
                String value = entry.getValue();
                String methodName = "set" + Character.toUpperCase(name.charAt(0)) + name.substring(1);
                Method method = getSetMethod(clazz, methodName);

                if(method != null)
                {
                    Class<?>[] parameterTypes = method.getParameterTypes();

                    if(parameterTypes.length > 0)
                    {
                        Class<?> parameterType = parameterTypes[0];

                        if(parameterType == char.class || parameterType == Character.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getInteger(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == boolean.class || parameterType == Boolean.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getBoolean(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == byte.class || parameterType == Byte.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getByte(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == short.class || parameterType == Short.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getShort(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == int.class || parameterType == Integer.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getInteger(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == float.class || parameterType == Float.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getFloat(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == double.class || parameterType == Double.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getDouble(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == long.class || parameterType == Long.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getLong(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == String.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getString(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == java.util.Date.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.getDate(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                        else if(parameterType == Object.class)
                        {
                            writer.println("" + tagInstanceName + "." + methodName + "(ExpressionUtil.evaluate(expressionContext, \"" + this.escape(value) + "\"));");
                        }
                    }
                    else
                    {
                    }
                }
            }
        }
        catch(ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param type
     * @param methodName
     * @return Method
     */
    public static Method getSetMethod(Class<?> type, String methodName)
    {
        Method[] methods = type.getMethods();

        for(Method method : methods)
        {
            if(method.getModifiers() != Modifier.PUBLIC)
            {
                continue;
            }

            if(method.getName().equals(methodName))
            {
                if(method.getParameterTypes().length == 1)
                {
                    return method;
                }
            }
        }

        return null;
    }

    /**
     * @param tagClassName
     * @param tag
     * @return boolean
     * @throws ClassNotFoundException 
     */
    public boolean isAssignableFrom(String tagClassName, Class<?> parent)
    {
        try
        {
            Class<?> clazz = ClassUtil.getClass(tagClassName);
            return parent.isAssignableFrom(clazz);
        }
        catch(ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param node
     * @param prefix
     * @return String
     */
    public String getVariableName(Node node, String prefix)
    {
        if(node != null)
        {
            return prefix + (node.getOffset() + 1);
        }
        else
        {
            return prefix + "undefined";
        }
    }
    
    /**
     * @param source
     * @return String
     */
    public String escape(String source)
    {
        if(source == null)
        {
            return "";
        }

        char c;
        StringBuilder buffer = new StringBuilder();

        for(int i = 0, length = source.length(); i < length; i++)
        {
            c = source.charAt(i);

            switch (c)
            {
                case '\'':
                {
                    buffer.append("\\\'");break;
                }
                case '"':
                {
                    buffer.append("\\\"");break;
                }
                case '\r':
                {
                    buffer.append("\\r");break;
                }
                case '\n':
                {
                    buffer.append("\\n");break;
                }
                case '\t':
                {
                    buffer.append("\\t");break;
                }
                case '\b':
                {
                    buffer.append("\\b");break;
                }
                case '\f':
                {
                    buffer.append("\\f");break;
                }
                default :
                {
                    buffer.append(c);break;
                }
            }   
        }

        return buffer.toString();
    }
}
