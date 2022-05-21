package ru.bstu.it32.nasypalov.lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        String sb = "[b]Жирный текст[/b][url=\"http://test.ru\"]ссылка[/url][img=\"http://test.ru/img.jpg\"][font=\"Arial\"][size=\"14px\"]часть часть[/size] текста [font=\"Times New Roman\"] другим [/font] шрифтом[/font]";
        String temp = sb;
        String result = "";

        Pattern p1 = Pattern.compile("\\[\\w+(\\s*=\\s*\"?[\\w\\s(:/)?.]+\"?)?]|\\s*[а-яА-Я0-9\\s*]+\\s*|\\[/\\w+]");

        Matcher matcher = p1.matcher(sb);

        while (matcher.find()){
            result = matcher.group().trim();
            System.out.println(result);

            if (result.contains("[font")){
                out.append("<span style = \"font-family: ").append(result, result.indexOf("=") + 1,
                        result.lastIndexOf("\"") + 1).append(">");
            }
            else if (result.contains("/font")){
                out.append("</span>");
            }
            else if (result.contains("[size")){
                out.append("<span style = \"font-size: ").append(result, result.indexOf("=") + 1,
                        result.lastIndexOf("\"") + 1).append(">");
            }
            else if (result.contains("/size")){
                out.append("</span>");
            }
            else if (result.contains("[color")){
                out.append("<span style = \"color: ").append(result, result.indexOf("=") + 1,
                        result.lastIndexOf("\"") + 1).append(">");
            }
            else if (result.contains("/color")){
                out.append("</span>");
            }
            else if (result.contains("[img")){
                out.append("<img src = ").append(result, result.indexOf("=") + 1,
                        result.lastIndexOf("\"") + 1).append(">");
            }
            else if (result.contains("[url")){
                out.append("<a href = ").append(result, result.indexOf("=") + 1,
                        result.lastIndexOf("\"") + 1).append(">");
            }
            else if (result.contains("/url")){
                out.append("</a>");
            }
            else if (result.matches("\\s*[а-яА-Я0-9\\s*]+\\s*")){
                out.append(result);
            }
            else if (result.contains("[b]")){
                out.append("<b>");
            }
            else if (result.contains("[/b]")){
                out.append("</b>");
            }
            else if (result.contains("[i]")){
                out.append("<i>");
            }
            else if (result.contains("[/i]")){
                out.append("</i>");
            }
            temp = temp.substring(matcher.end());
            matcher = p1.matcher(temp);
        }
        System.out.println(out);

    }
}

