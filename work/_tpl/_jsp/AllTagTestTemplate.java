/*
 * $RCSfile: AllTagTestTemplate.java,v $$
 * $Revision: 1.1 $
 * $Date: 2014-07-17 $
 *
 * Copyright (C) 2008 Skin, Inc. All rights reserved.
 *
 * This software is the proprietary information of Skin, Inc.
 * Use is subject to license terms.
 *
 * home: D:\workspace2\ayada\webapp
 * path: allTagTest.jsp
 * lastModified: 2014-07-14 09:47:00 116
 * options: -fastJstl true
 * JSP generated by JspCompiler-1.0.1.0 (built 2014-07-17 10:06:50 342)
 */
package _tpl._jsp;

import java.io.Writer;
import com.skin.ayada.runtime.ExpressionContext;
import com.skin.ayada.runtime.JspWriter;
import com.skin.ayada.runtime.PageContext;
import com.skin.ayada.tagext.BodyContent;
import com.skin.ayada.tagext.BodyTag;
import com.skin.ayada.tagext.IterationTag;
import com.skin.ayada.tagext.JspFragment;
import com.skin.ayada.tagext.Tag;
import com.skin.ayada.template.JspTemplate;
import com.skin.ayada.util.ExpressionUtil;
import java.io.IOException; // jsp:directive.import: lineNumber: 4


/**
 * <p>Title: AllTagTestTemplate</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * @author JspCompiler
 * @version 1.0
 */
@SuppressWarnings("unused")
public class AllTagTestTemplate extends JspTemplate{
    public static void main(String[] args){
        java.io.StringWriter writer = new java.io.StringWriter();
        PageContext pageContext = com.skin.ayada.runtime.JspFactory.getDefaultPageContext(writer);
        AllTagTestTemplate template = new AllTagTestTemplate();

        try{
            template.execute(pageContext);
            System.out.println(writer.toString());
        }
        catch(Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }
    // JSP_DECLARATION: lineNumber: 9
    public void hello1(JspWriter out) throws IOException{
        out.println("Hello, World !");
    }
    // jsp:declaration END

    // JSP_DECLARATION: lineNumber: 15
    public void hello2(JspWriter out) throws IOException{
        out.println("Hello, World !");
    }
    // jsp:declaration END

    // JSP_DECLARATION: lineNumber: 21
    public void hello3(JspWriter out) throws IOException{
        out.println("Hello, World !");
    }
    // jsp:declaration END

    // JSP_DECLARATION: lineNumber: 27
    public void hello4(JspWriter out) throws IOException{
        out.println("Hello, World !");
    }
    // jsp:declaration END

    // JSP_DECLARATION: lineNumber: 47
    public int myInt = 0;
    // jsp:declaration END


    /**
     * @param pageContext
     * @throws Throwable
     */
    @Override
    public void _execute(final PageContext pageContext) throws Throwable{
        JspWriter out = pageContext.getOut();
        JspWriter jspWriter = pageContext.getOut();
        ExpressionContext expressionContext = pageContext.getExpressionContext();
        // jsp:directive.page: lineNumber: 1
        // <jsp:directive.page contentType="text/html;charset=UTF-8"/>

        // jsp:directive.taglib: lineNumber: 2
        // <jsp:directive.taglib taglib="" prefix="c" uri="http://java.sun.com/jsp/jstl/core"/>

        // jsp:directive.taglib: lineNumber: 3
        // <jsp:directive.taglib taglib="" prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"/>

        // jsp:directive.page: lineNumber: 4
        // <jsp:directive.page import="java.io.IOException"/>

        // jsp:declaration: lineNumber: 9
        // <jsp:declaration>...</jsp:declaration>

        // jsp:declaration: lineNumber: 15
        // <jsp:declaration>...</jsp:declaration>

        // jsp:declaration: lineNumber: 21
        // <jsp:declaration>...</jsp:declaration>

        // jsp:declaration: lineNumber: 27
        // <jsp:declaration>...</jsp:declaration>

        // TEXT: lineNumber: 31
        // out.write("<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body jsp=\"");
        out.write(_jsp_string_17, 0, _jsp_string_17.length);

        // jsp:expression: lineNumber: 35
        out.print(1 + 2);
        // jsp:expression END

        // TEXT: lineNumber: 35
        // out.write("\" version=\"1.0\">\r\n============================================\r\n");
        out.write(_jsp_string_20, 0, _jsp_string_20.length);

        // jsp:scriptlet: lineNumber: 38
    out.println("Hello, World !");

        // jsp:scriptlet END

        // TEXT: lineNumber: 41
        // out.write("============================================\r\n");
        out.write(_jsp_string_23, 0, _jsp_string_23.length);

        // jsp:scriptlet: lineNumber: 43
    out.println("Hello, World !");

        // jsp:scriptlet END

        // jsp:declaration: lineNumber: 47
        // <jsp:declaration>...</jsp:declaration>

        // jsp:scriptlet: lineNumber: 51
    // out.println("Hello, World1 !");

        // jsp:scriptlet END

        // jsp:scriptlet: lineNumber: 55
    // out.println("Hello, World2 ! </test");
    // out.println("Hello, World2 ! </jsp:scriptlet2>");

        // jsp:scriptlet END

        // jsp:scriptlet: lineNumber: 60
    int mytest = 0;

        // jsp:scriptlet END

        // TEXT: lineNumber: 63
        // out.write("<p>\r\n    myInt: ");
        out.write(_jsp_string_34, 0, _jsp_string_34.length);

        // jsp:expression: lineNumber: 64
        out.print( this.myInt );
        // jsp:expression END

        // TEXT: lineNumber: 64
        // out.write("\r\n</p>\r\n\r\n<p>\r\n    mytest: ");
        out.write(_jsp_string_37, 0, _jsp_string_37.length);

        // jsp:expression: lineNumber: 68
        out.print(mytest);
        // jsp:expression END

        // TEXT: lineNumber: 68
        // out.write("\r\n</p>\r\n");
        out.write(_jsp_string_40, 0, _jsp_string_40.length);

        // jsp:scriptlet: lineNumber: 71
    out.println("Hello, World4 !");

        // jsp:scriptlet END

        // jsp:expression: lineNumber: 74
        out.print(("Hello" + " " + "World !"));
        // jsp:expression END

        // TEXT: lineNumber: 74
        // out.write("\r\n============================================\r\n");
        out.write(_jsp_string_45, 0, _jsp_string_45.length);

        // NODE START: lineNumber: 76, offset: 45, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_46
        // <c:set var="myString" value="${StringUtil.replace(&#39;abc&#39;, &#39;b&#39;, &#39;\n&#39;)}"/>
        pageContext.setAttribute("myString", ExpressionUtil.evaluate(expressionContext, "${StringUtil.replace(\'abc\', \'b\', \'\\n\')}", null));
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 76, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_46

        // TEXT: lineNumber: 77
        // out.write("<p>myString: [");
        out.write(_jsp_string_48, 0, _jsp_string_48.length);

        // NODE START: lineNumber: 77, offset: 48, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_49
        // <c:out value="${myString}"/>
        out.print(ExpressionUtil.getString(expressionContext, "${myString}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 77, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_49

        // TEXT: lineNumber: 77
        // out.write("]</p>\r\n\r\n");
        out.write(_jsp_string_51, 0, _jsp_string_51.length);

        // NODE START: lineNumber: 79, offset: 51, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_52
        // <c:set var="myString" value="&quot;a + 1&quot;"/>
        pageContext.setAttribute("myString", "\"a + 1\"");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 79, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_52

        // TEXT: lineNumber: 80
        // out.write("<p>myString: [");
        out.write(_jsp_string_54, 0, _jsp_string_54.length);

        // NODE START: lineNumber: 80, offset: 54, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_55
        // <c:out value="${myString}"/>
        out.print(ExpressionUtil.getString(expressionContext, "${myString}"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 80, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_55

        // TEXT: lineNumber: 80
        // out.write("]</p>\r\n\r\n");
        out.write(_jsp_string_57, 0, _jsp_string_57.length);

        // NODE START: lineNumber: 82, offset: 57, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_58
        // <c:set var="myVar" value="Hello, World!"/>
        pageContext.setAttribute("myVar", "Hello, World!");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 82, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_58

        // TEXT: lineNumber: 83
        // out.write("<h1>############## ");
        out.write(_jsp_string_60, 0, _jsp_string_60.length);
        // VARIABLE: lineNumber: 83
        out.print(pageContext.getAttribute("myVar"), false);
        // TEXT: lineNumber: 83
        // out.write(" ##############</h1>\r\n\r\n");
        out.write(_jsp_string_62, 0, _jsp_string_62.length);

        // NODE START: lineNumber: 85, offset: 62, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_63
        // <c:out value="c:out: Hello, World!"/>
        out.print("c:out: Hello, World!");
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 85, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_63

        // TEXT: lineNumber: 85
        // out.write("\r\n<div style=\"background-color: #c0c0c0;\"></div>\r\n");
        out.write(_jsp_string_65, 0, _jsp_string_65.length);

        // NODE START: lineNumber: 87, offset: 65, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_66
        // <c:out value="&quot;&lt;div&gt;Hello World!&lt;/div&gt;&quot;" escapeXml="false"/>
        out.print("\"<div>Hello World!</div>\"");
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 87, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_66

        // TEXT: lineNumber: 87
        // out.write("\r\n");
        out.write(_jsp_string_68, 0, _jsp_string_68.length);

        // NODE START: lineNumber: 88, offset: 68, length: 3, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_69
        // <c:out escapeXml="true">...</c:out>
        out = pageContext.pushBody();
        // TEXT: lineNumber: 88
        // out.write("<h1>Hello World!</h1>");
        out.write(_jsp_string_70, 0, _jsp_string_70.length);
        pageContext.print((BodyContent)out, true);
        out = pageContext.popBody();
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 88, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_69

        // TEXT: lineNumber: 88
        // out.write("\r\n");
        out.write(_jsp_string_72, 0, _jsp_string_72.length);

        // NODE START: lineNumber: 89, offset: 72, length: 3, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_73
        // <c:out value="&lt;div&gt;Hello World!&lt;/div&gt;" escapeXml="true">...</c:out>
        out.print("&lt;div&gt;Hello World!&lt;/div&gt;");
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 89, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_73

        // TEXT: lineNumber: 89
        // out.write("\r\n\r\n");
        out.write(_jsp_string_76, 0, _jsp_string_76.length);

        // NODE START: lineNumber: 91, offset: 76, length: 2, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_77
        // <c:set var="myName" value="xuesong.net"/>
        pageContext.setAttribute("myName", "xuesong.net");
        // jsp.jstl.core.SetTag END
        // NODE END: lineNumber: 91, tagClassName: com.skin.ayada.jstl.core.SetTag, tagInstanceName: _jsp_SetTag_77

        // NODE START: lineNumber: 92, offset: 78, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_79
        // <c:out value="Hello, ${myName}!" escapeXml="true"/>
        out.print(ExpressionUtil.getHtml(expressionContext, "Hello, ${myName}!"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 92, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_79

        // TEXT: lineNumber: 92
        // out.write("\r\n");
        out.write(_jsp_string_81, 0, _jsp_string_81.length);

        // NODE START: lineNumber: 93, offset: 81, length: 2, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_82
        // <c:out value="Hello, ${myName}!" escapeXml="false"/>
        out.print(ExpressionUtil.getString(expressionContext, "Hello, ${myName}!"));
        // jsp.jstl.core.OutTag END
        // NODE END: lineNumber: 93, tagClassName: com.skin.ayada.jstl.core.OutTag, tagInstanceName: _jsp_OutTag_82

        // TEXT: lineNumber: 93
        // out.write("\r\n\r\n");
        out.write(_jsp_string_84, 0, _jsp_string_84.length);

        // NODE START: lineNumber: 95, offset: 84, length: 3, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_85
        // <c:if test="${1 == 1}">...</c:if>
        if(ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
            // TEXT: lineNumber: 95
            // out.write("c:if test");
            out.write(_jsp_string_86, 0, _jsp_string_86.length);
        } // jsp.jstl.core.IfTag END
        // NODE END: lineNumber: 95, tagClassName: com.skin.ayada.jstl.core.IfTag, tagInstanceName: _jsp_IfTag_85

        // TEXT: lineNumber: 95
        // out.write("\r\n\r\n<h1>c:forEach test1</h1>\r\n");
        out.write(_jsp_string_88, 0, _jsp_string_88.length);

        // NODE START: lineNumber: 98, offset: 88, length: 3, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_89
        // <c:each items="1,2,3,4,5" var="mynum">...</c:each>
        Object _jsp_old_var_89 = pageContext.getAttribute("mynum");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_89 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_89.setParent((Tag)null);
        _jsp_ForEachTag_89.setPageContext(pageContext);
        _jsp_ForEachTag_89.setVar("mynum");
        _jsp_ForEachTag_89.setItems("1,2,3,4,5");
        if(_jsp_ForEachTag_89.doStartTag() != Tag.SKIP_BODY){
            while(true){
                // VARIABLE: lineNumber: 100
                out.print(pageContext.getAttribute("mynum"), false);
                if(_jsp_ForEachTag_89.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                    break;
                }
            }
        }
        _jsp_ForEachTag_89.release();
        pageContext.setAttribute("mynum", _jsp_old_var_89);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 98, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_89

        // TEXT: lineNumber: 100
        // out.write("\r\n\r\n<h1>c:forEach test2</h1>\r\n");
        out.write(_jsp_string_92, 0, _jsp_string_92.length);

        // NODE START: lineNumber: 103, offset: 92, length: 20, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_93
        // <c:forEach items="${userList}" var="user" varStatus="status">...</c:forEach>
        Object _jsp_old_var_93 = pageContext.getAttribute("user");
        Object _jsp_old_var_status_93 = pageContext.getAttribute("status");
        com.skin.ayada.jstl.core.ForEachTag _jsp_ForEachTag_93 = new com.skin.ayada.jstl.core.ForEachTag();
        _jsp_ForEachTag_93.setParent((Tag)null);
        _jsp_ForEachTag_93.setPageContext(pageContext);
        _jsp_ForEachTag_93.setVar("user");
        _jsp_ForEachTag_93.setItems(ExpressionUtil.evaluate(expressionContext, "${userList}", null));
        _jsp_ForEachTag_93.setVarStatus("status");
        if(_jsp_ForEachTag_93.doStartTag() != Tag.SKIP_BODY){
            while(true){
                // TEXT: lineNumber: 103
                // out.write("\r\n    <p>user: ");
                out.write(_jsp_string_94, 0, _jsp_string_94.length);
                // EXPRESSION: lineNumber: 104
                out.write(expressionContext.getString("user.userName"));
                // TEXT: lineNumber: 104
                // out.write("</p>\r\n    ");
                out.write(_jsp_string_96, 0, _jsp_string_96.length);

                // NODE START: lineNumber: 105, offset: 96, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_97
                // <c:choose>...</c:choose>
                boolean _jsp_ChooseTag_97 = true;

                // NODE START: lineNumber: 106, offset: 97, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_98
                // <c:when test="${user.userName == &#39;test1&#39;}">...</c:when>
                if(_jsp_ChooseTag_97 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test1\'}")){
                    _jsp_ChooseTag_97 = false;
                    // TEXT: lineNumber: 106
                    // out.write("<p>test1, good man !</p>");
                    out.write(_jsp_string_99, 0, _jsp_string_99.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 106, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_98

                // NODE START: lineNumber: 107, offset: 100, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_101
                // <c:when test="${user.userName == &#39;test2&#39;}">...</c:when>
                if(_jsp_ChooseTag_97 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test2\'}")){
                    _jsp_ChooseTag_97 = false;
                    // TEXT: lineNumber: 107
                    // out.write("<p>test2, good man !</p>");
                    out.write(_jsp_string_102, 0, _jsp_string_102.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 107, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_101

                // NODE START: lineNumber: 108, offset: 103, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_104
                // <c:when test="${user.userName == &#39;test3&#39;}">...</c:when>
                if(_jsp_ChooseTag_97 && ExpressionUtil.getBoolean(expressionContext, "${user.userName == \'test3\'}")){
                    _jsp_ChooseTag_97 = false;
                    // TEXT: lineNumber: 108
                    // out.write("<p>test3, good man !</p>");
                    out.write(_jsp_string_105, 0, _jsp_string_105.length);
                } // jsp.jstl.core.WhenTag END
                // NODE END: lineNumber: 108, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_104

                // NODE START: lineNumber: 109, offset: 106, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_107
                // <c:otherwise>...</c:otherwise>
                if(_jsp_ChooseTag_97){
                    _jsp_ChooseTag_97 = false;
                    // TEXT: lineNumber: 109
                    // out.write("<p>unknown user! Do you known \'bad egg\'? You! Are!</p>");
                    out.write(_jsp_string_108, 0, _jsp_string_108.length);
                } // jsp.jstl.core.OtherwiseTag END
                // NODE END: lineNumber: 109, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_107

                // jsp.jstl.core.ChooseTag END
                // NODE END: lineNumber: 105, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_97

                // TEXT: lineNumber: 110
                // out.write("\r\n");
                out.write(_jsp_string_111, 0, _jsp_string_111.length);
                if(_jsp_ForEachTag_93.doAfterBody() != IterationTag.EVAL_BODY_AGAIN){
                    break;
                }
            }
        }
        _jsp_ForEachTag_93.release();
        pageContext.setAttribute("user", _jsp_old_var_93);
        pageContext.setAttribute("status", _jsp_old_var_status_93);
        // jsp.jstl.core.ForEachTag END
        // NODE END: lineNumber: 103, tagClassName: com.skin.ayada.jstl.core.ForEachTag, tagInstanceName: _jsp_ForEachTag_93

        // TEXT: lineNumber: 111
        // out.write("\r\n\r\n<h1>c:choose test1</h1>\r\n");
        out.write(_jsp_string_113, 0, _jsp_string_113.length);

        // NODE START: lineNumber: 114, offset: 113, length: 14, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_114
        // <c:choose>...</c:choose>
        boolean _jsp_ChooseTag_114 = true;

        // NODE START: lineNumber: 115, offset: 114, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_115
        // <c:when test="${1 == 1}">...</c:when>
        if(_jsp_ChooseTag_114 && ExpressionUtil.getBoolean(expressionContext, "${1 == 1}")){
            _jsp_ChooseTag_114 = false;
            // TEXT: lineNumber: 115
            // out.write("c:when test=\"{1 == 1}\"");
            out.write(_jsp_string_116, 0, _jsp_string_116.length);
        } // jsp.jstl.core.WhenTag END
        // NODE END: lineNumber: 115, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_115

        // NODE START: lineNumber: 116, offset: 117, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_118
        // <c:when test="${2 == 2}">...</c:when>
        if(_jsp_ChooseTag_114 && ExpressionUtil.getBoolean(expressionContext, "${2 == 2}")){
            _jsp_ChooseTag_114 = false;
            // TEXT: lineNumber: 116
            // out.write("c:when test=\"{2 == 2}\"");
            out.write(_jsp_string_119, 0, _jsp_string_119.length);
        } // jsp.jstl.core.WhenTag END
        // NODE END: lineNumber: 116, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_118

        // NODE START: lineNumber: 117, offset: 120, length: 3, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_121
        // <c:when test="${3 == 3}">...</c:when>
        if(_jsp_ChooseTag_114 && ExpressionUtil.getBoolean(expressionContext, "${3 == 3}")){
            _jsp_ChooseTag_114 = false;
            // TEXT: lineNumber: 117
            // out.write("c:when test=\"{3 == 3}\"");
            out.write(_jsp_string_122, 0, _jsp_string_122.length);
        } // jsp.jstl.core.WhenTag END
        // NODE END: lineNumber: 117, tagClassName: com.skin.ayada.jstl.core.WhenTag, tagInstanceName: _jsp_WhenTag_121

        // NODE START: lineNumber: 118, offset: 123, length: 3, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_124
        // <c:otherwise>...</c:otherwise>
        if(_jsp_ChooseTag_114){
            _jsp_ChooseTag_114 = false;
            // TEXT: lineNumber: 118
            // out.write("c:otherwise");
            out.write(_jsp_string_125, 0, _jsp_string_125.length);
        } // jsp.jstl.core.OtherwiseTag END
        // NODE END: lineNumber: 118, tagClassName: com.skin.ayada.jstl.core.OtherwiseTag, tagInstanceName: _jsp_OtherwiseTag_124

        // jsp.jstl.core.ChooseTag END
        // NODE END: lineNumber: 114, tagClassName: com.skin.ayada.jstl.core.ChooseTag, tagInstanceName: _jsp_ChooseTag_114

        // TEXT: lineNumber: 119
        // out.write("\r\n\r\n<h1>app:test test1</h1>\r\n");
        out.write(_jsp_string_128, 0, _jsp_string_128.length);

        // NODE START: lineNumber: 122, offset: 128, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_129
        // <app:test myBoolean="true" myChar="c" myByte="1" myInt="-1.0" myFloat="1.0f" myDouble="1.0d" myLong="1L" myString="Hello"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_129 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_129.setPageContext(pageContext);
        _jsp_TestTag_129.setParent((Tag)null);
        _jsp_TestTag_129.setMyBoolean(true);
        _jsp_TestTag_129.setMyChar('c');
        _jsp_TestTag_129.setMyByte((byte)1);
        _jsp_TestTag_129.setMyInt(-1);
        _jsp_TestTag_129.setMyFloat(1.0f);
        _jsp_TestTag_129.setMyDouble(1.0d);
        _jsp_TestTag_129.setMyLong(1L);
        _jsp_TestTag_129.setMyString("Hello");
        int _jsp_start_flag_129 = _jsp_TestTag_129.doStartTag();

        if(_jsp_start_flag_129 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_129 != Tag.SKIP_BODY){
            _jsp_TestTag_129.doAfterBody();
        }
        _jsp_TestTag_129.doEndTag();
        _jsp_TestTag_129.release();
        // NODE END: lineNumber: 122, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_129

        // TEXT: lineNumber: 122
        // out.write("\r\n");
        out.write(_jsp_string_131, 0, _jsp_string_131.length);

        // NODE START: lineNumber: 123, offset: 131, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_132
        // <app:test myBoolean="false" myChar="c" myByte="243" myInt="-1.0" myFloat="1.0F" myDouble="1.0D" myLong="1L" myString="Hello"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_132 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_132.setPageContext(pageContext);
        _jsp_TestTag_132.setParent((Tag)null);
        _jsp_TestTag_132.setMyBoolean(false);
        _jsp_TestTag_132.setMyChar('c');
        _jsp_TestTag_132.setMyByte((byte)243);
        _jsp_TestTag_132.setMyInt(-1);
        _jsp_TestTag_132.setMyFloat(1.0f);
        _jsp_TestTag_132.setMyDouble(1.0d);
        _jsp_TestTag_132.setMyLong(1L);
        _jsp_TestTag_132.setMyString("Hello");
        int _jsp_start_flag_132 = _jsp_TestTag_132.doStartTag();

        if(_jsp_start_flag_132 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_132 != Tag.SKIP_BODY){
            _jsp_TestTag_132.doAfterBody();
        }
        _jsp_TestTag_132.doEndTag();
        _jsp_TestTag_132.release();
        // NODE END: lineNumber: 123, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_132

        // TEXT: lineNumber: 123
        // out.write("\r\n");
        out.write(_jsp_string_134, 0, _jsp_string_134.length);

        // NODE START: lineNumber: 124, offset: 134, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_135
        // <app:test myInt="-1.0" myFloat="1.0" myDouble="1e3" myLong="1e3" myString="Hello"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_135 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_135.setPageContext(pageContext);
        _jsp_TestTag_135.setParent((Tag)null);
        _jsp_TestTag_135.setMyInt(-1);
        _jsp_TestTag_135.setMyFloat(1.0f);
        _jsp_TestTag_135.setMyDouble(1000.0d);
        _jsp_TestTag_135.setMyLong(1000L);
        _jsp_TestTag_135.setMyString("Hello");
        int _jsp_start_flag_135 = _jsp_TestTag_135.doStartTag();

        if(_jsp_start_flag_135 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_135 != Tag.SKIP_BODY){
            _jsp_TestTag_135.doAfterBody();
        }
        _jsp_TestTag_135.doEndTag();
        _jsp_TestTag_135.release();
        // NODE END: lineNumber: 124, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_135

        // TEXT: lineNumber: 124
        // out.write("\r\n");
        out.write(_jsp_string_137, 0, _jsp_string_137.length);

        // NODE START: lineNumber: 125, offset: 137, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_138
        // <app:test myInt="-1.0" myFloat="1.0" myDouble="1.2e3" myLong="1.2e3" myString="Hello"/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_138 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_138.setPageContext(pageContext);
        _jsp_TestTag_138.setParent((Tag)null);
        _jsp_TestTag_138.setMyInt(-1);
        _jsp_TestTag_138.setMyFloat(1.0f);
        _jsp_TestTag_138.setMyDouble(1200.0d);
        _jsp_TestTag_138.setMyLong(1200L);
        _jsp_TestTag_138.setMyString("Hello");
        int _jsp_start_flag_138 = _jsp_TestTag_138.doStartTag();

        if(_jsp_start_flag_138 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_138 != Tag.SKIP_BODY){
            _jsp_TestTag_138.doAfterBody();
        }
        _jsp_TestTag_138.doEndTag();
        _jsp_TestTag_138.release();
        // NODE END: lineNumber: 125, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_138

        // TEXT: lineNumber: 125
        // out.write("\r\n\r\n<h1>app:scrollpage test1</h1>\r\n");
        out.write(_jsp_string_140, 0, _jsp_string_140.length);

        // NODE START: lineNumber: 128, offset: 140, length: 2, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _jsp_ScrollPage_141
        // <app:scrollpage count="254" pageNum="2" pageSize="10"/>
        test.com.skin.ayada.taglib.ScrollPage _jsp_ScrollPage_141 = new test.com.skin.ayada.taglib.ScrollPage();
        _jsp_ScrollPage_141.setPageContext(pageContext);
        _jsp_ScrollPage_141.setParent((Tag)null);
        _jsp_ScrollPage_141.setCount(254);
        _jsp_ScrollPage_141.setPageNum(2);
        _jsp_ScrollPage_141.setPageSize(10);
        int _jsp_start_flag_141 = _jsp_ScrollPage_141.doStartTag();

        if(_jsp_start_flag_141 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_141 != Tag.SKIP_BODY){
            _jsp_ScrollPage_141.doAfterBody();
        }
        _jsp_ScrollPage_141.doEndTag();
        _jsp_ScrollPage_141.release();
        // NODE END: lineNumber: 128, tagClassName: test.com.skin.ayada.taglib.ScrollPage, tagInstanceName: _jsp_ScrollPage_141

        // TEXT: lineNumber: 128
        // out.write("\r\n\r\n");
        out.write(_jsp_string_143, 0, _jsp_string_143.length);

        // NODE START: lineNumber: 130, offset: 143, length: 2, tagClassName: test.com.skin.ayada.taglib.TestBodyTag, tagInstanceName: _jsp_TestBodyTag_144
        // <app:bodytest/>
        test.com.skin.ayada.taglib.TestBodyTag _jsp_TestBodyTag_144 = new test.com.skin.ayada.taglib.TestBodyTag();
        _jsp_TestBodyTag_144.setPageContext(pageContext);
        _jsp_TestBodyTag_144.setParent((Tag)null);
        int _jsp_start_flag_144 = _jsp_TestBodyTag_144.doStartTag();

        if(_jsp_start_flag_144 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_144 != Tag.SKIP_BODY){
            _jsp_TestBodyTag_144.doAfterBody();
        }
        _jsp_TestBodyTag_144.doEndTag();
        _jsp_TestBodyTag_144.release();
        // NODE END: lineNumber: 130, tagClassName: test.com.skin.ayada.taglib.TestBodyTag, tagInstanceName: _jsp_TestBodyTag_144

        // TEXT: lineNumber: 130
        // out.write("\r\n");
        out.write(_jsp_string_146, 0, _jsp_string_146.length);

        // NODE START: lineNumber: 131, offset: 146, length: 3, tagClassName: test.com.skin.ayada.taglib.TestBodyTag, tagInstanceName: _jsp_TestBodyTag_147
        // <app:bodytest>...</app:bodytest>
        test.com.skin.ayada.taglib.TestBodyTag _jsp_TestBodyTag_147 = new test.com.skin.ayada.taglib.TestBodyTag();
        _jsp_TestBodyTag_147.setPageContext(pageContext);
        _jsp_TestBodyTag_147.setParent((Tag)null);
        int _jsp_start_flag_147 = _jsp_TestBodyTag_147.doStartTag();

        if(_jsp_start_flag_147 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_147 != Tag.SKIP_BODY){
            int _jsp_flag_147 = 0;
            if(_jsp_start_flag_147 == BodyTag.EVAL_BODY_BUFFERED){
                BodyContent _jsp_body_content_147 = pageContext.pushBody();
                _jsp_TestBodyTag_147.setBodyContent(_jsp_body_content_147);
                _jsp_TestBodyTag_147.doInitBody();
                out = _jsp_body_content_147;
            }

            do{
                // TEXT: lineNumber: 131
                // out.write("Hello World !");
                out.write(_jsp_string_148, 0, _jsp_string_148.length);
                _jsp_flag_147 = _jsp_TestBodyTag_147.doAfterBody();
            }
            while(_jsp_flag_147 == IterationTag.EVAL_BODY_AGAIN);
            if(_jsp_start_flag_147 == BodyTag.EVAL_BODY_BUFFERED){
                out = pageContext.popBody();
            }
        }
        _jsp_TestBodyTag_147.doEndTag();
        _jsp_TestBodyTag_147.release();
        // NODE END: lineNumber: 131, tagClassName: test.com.skin.ayada.taglib.TestBodyTag, tagInstanceName: _jsp_TestBodyTag_147

        // TEXT: lineNumber: 131
        // out.write("\r\n");
        out.write(_jsp_string_150, 0, _jsp_string_150.length);

        // NODE START: lineNumber: 132, offset: 150, length: 2, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_151
        // <c:test/>
        com.skin.ayada.jstl.core.TestTag _jsp_TestTag_151 = new com.skin.ayada.jstl.core.TestTag();
        _jsp_TestTag_151.setPageContext(pageContext);
        _jsp_TestTag_151.setParent((Tag)null);
        int _jsp_start_flag_151 = _jsp_TestTag_151.doStartTag();

        if(_jsp_start_flag_151 == Tag.SKIP_PAGE){
            return;
        }
        if(_jsp_start_flag_151 != Tag.SKIP_BODY){
            _jsp_TestTag_151.doAfterBody();
        }
        _jsp_TestTag_151.doEndTag();
        _jsp_TestTag_151.release();
        // NODE END: lineNumber: 132, tagClassName: com.skin.ayada.jstl.core.TestTag, tagInstanceName: _jsp_TestTag_151

        // TEXT: lineNumber: 132
        // out.write("\r\n</body>\r\n</html>");
        out.write(_jsp_string_153, 0, _jsp_string_153.length);

        out.flush();
        jspWriter.flush();
    }

    private static final char[] _jsp_string_17 = "<html>\r\n<head>\r\n<title>test</title>\r\n</head>\r\n<body jsp=\"".toCharArray();
    private static final char[] _jsp_string_20 = "\" version=\"1.0\">\r\n============================================\r\n".toCharArray();
    private static final char[] _jsp_string_23 = "============================================\r\n".toCharArray();
    private static final char[] _jsp_string_34 = "<p>\r\n    myInt: ".toCharArray();
    private static final char[] _jsp_string_37 = "\r\n</p>\r\n\r\n<p>\r\n    mytest: ".toCharArray();
    private static final char[] _jsp_string_40 = "\r\n</p>\r\n".toCharArray();
    private static final char[] _jsp_string_45 = "\r\n============================================\r\n".toCharArray();
    private static final char[] _jsp_string_48 = "<p>myString: [".toCharArray();
    private static final char[] _jsp_string_51 = "]</p>\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_54 = "<p>myString: [".toCharArray();
    private static final char[] _jsp_string_57 = "]</p>\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_60 = "<h1>############## ".toCharArray();
    private static final char[] _jsp_string_62 = " ##############</h1>\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_65 = "\r\n<div style=\"background-color: #c0c0c0;\"></div>\r\n".toCharArray();
    private static final char[] _jsp_string_68 = "\r\n".toCharArray();
    private static final char[] _jsp_string_70 = "<h1>Hello World!</h1>".toCharArray();
    private static final char[] _jsp_string_72 = "\r\n".toCharArray();
    private static final char[] _jsp_string_74 = "<h1>Hello World!</h1>".toCharArray();
    private static final char[] _jsp_string_76 = "\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_81 = "\r\n".toCharArray();
    private static final char[] _jsp_string_84 = "\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_86 = "c:if test".toCharArray();
    private static final char[] _jsp_string_88 = "\r\n\r\n<h1>c:forEach test1</h1>\r\n".toCharArray();
    private static final char[] _jsp_string_92 = "\r\n\r\n<h1>c:forEach test2</h1>\r\n".toCharArray();
    private static final char[] _jsp_string_94 = "\r\n    <p>user: ".toCharArray();
    private static final char[] _jsp_string_96 = "</p>\r\n    ".toCharArray();
    private static final char[] _jsp_string_99 = "<p>test1, good man !</p>".toCharArray();
    private static final char[] _jsp_string_102 = "<p>test2, good man !</p>".toCharArray();
    private static final char[] _jsp_string_105 = "<p>test3, good man !</p>".toCharArray();
    private static final char[] _jsp_string_108 = "<p>unknown user! Do you known \'bad egg\'? You! Are!</p>".toCharArray();
    private static final char[] _jsp_string_111 = "\r\n".toCharArray();
    private static final char[] _jsp_string_113 = "\r\n\r\n<h1>c:choose test1</h1>\r\n".toCharArray();
    private static final char[] _jsp_string_116 = "c:when test=\"{1 == 1}\"".toCharArray();
    private static final char[] _jsp_string_119 = "c:when test=\"{2 == 2}\"".toCharArray();
    private static final char[] _jsp_string_122 = "c:when test=\"{3 == 3}\"".toCharArray();
    private static final char[] _jsp_string_125 = "c:otherwise".toCharArray();
    private static final char[] _jsp_string_128 = "\r\n\r\n<h1>app:test test1</h1>\r\n".toCharArray();
    private static final char[] _jsp_string_131 = "\r\n".toCharArray();
    private static final char[] _jsp_string_134 = "\r\n".toCharArray();
    private static final char[] _jsp_string_137 = "\r\n".toCharArray();
    private static final char[] _jsp_string_140 = "\r\n\r\n<h1>app:scrollpage test1</h1>\r\n".toCharArray();
    private static final char[] _jsp_string_143 = "\r\n\r\n".toCharArray();
    private static final char[] _jsp_string_146 = "\r\n".toCharArray();
    private static final char[] _jsp_string_148 = "Hello World !".toCharArray();
    private static final char[] _jsp_string_150 = "\r\n".toCharArray();
    private static final char[] _jsp_string_153 = "\r\n</body>\r\n</html>".toCharArray();

}
