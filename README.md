# Java-Regex

## Regex in Java"

The input of the program is an arbitrary text, including the so-called. BB codes

Convert all BB codes to valid html tags. 
Example:

* [font="Arial"]текст[/font]
* [size="14px"]текст[/size]
* [color="#FF0000"]текст[/color]
* ...

The result should be:

* style="font-family: Arial">текст</span>
* style="font-size: 14px ">текст</span>
*  style="color: #FF0000 ">текст</span>
*  ...

Please note that BB codes can be nested inside each other
