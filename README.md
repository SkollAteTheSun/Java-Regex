# Java-Regex

## Регулярные выражения в Java"

На вход программы подается произвольный текст, включающий т.н. BB-коды

Преобразовать все BB-коды в корректные html-теги.
Пример:
[font="Arial"]текст[/font]
[size="14px"]текст[/size]
[color="#FF0000"]текст[/color]
[url="http://test.ru"]ссылка[/url]
[img="http://test.ru/img.jpg"]
…
В результате должно быть:
<span style="font-family: Arial">текст</span>
<span style="font-size: 14px ">текст</span>
<span style="color: #FF0000 ">текст</span>
<a href="http://test.ru">ссылка</a>
<img src="http://test.ru/img.jpg" />

Учесть, что BB-коды могут быть вложены друг в друга
