D [0-9]
L [a-zA-Z_]
H [a-fA-F0-9]
E [Ee][+-]?{D}+
FS (f|F|l|L)
IS (u|U|l|L)*

%{
#include <stdio.h>
%}
/*Se expondran las clases lexicas del lenguaje c*/
%%
"/*"   			{printf("<comentario-abierto>"); }
"*/"   			{printf("<comentario-cerrado>"); }
"auto" 			{printf("<AUTO>"); }
"case" 			{printf("<CASE>"); }
"char"			{printf("<CHAR>"); }
"const"			{printf("<CONST>"); }
"continue"		{printf("<CONTINUE>"); }
"default"		{printf("<DEFAULT>"); }
"do"			{printf("<DO>"); }
"double"		{printf("<DOUBLE>"); }
"else"			{printf("<ELSE>"); }
"enum"			{printf("<ENUM>"); }
"extern"		{printf("<EXTERN>"); }
"float"			{printf("<FLOAT>"); }
"for"			{printf("<FOR>"); }
"goto"			{printf("<GOTO>"); }
"if"			{printf("<IF>"); }
"int"			{printf("<INT>"); }
"long"			{printf("<LONG>"); }
"register"		{printf("<REGISTER>"); }
"return"		{printf("<RETURN>"); }
"short"			{printf("<SHORT>"); }
"signed"		{printf("<SIGNED>"); }
"sizeof"		{printf("<SIZEOF>"); }
"static"		{printf("<STATIC>"); }
"struct"		{printf("<STRUCT>"); }
"switch"		{printf("<SWITCH>"); }
"typedef"		{printf("<TYPEDEF>"); }
"union"			{printf("<UNION>"); }
"unsigned"		{printf("<UNSIGNED>"); }
"void"			{printf("<VOID>"); }
"volatile"		{printf("<VOLATILE>"); }
"while"			{printf("<WHILE>"); }

{L}({L}|{D})*		{printf("<IDENTIFIER>"); }

0[xX]{H}+{IS}?		{printf("<INTEGER-CONSTANT>"); }
0{D}+{IS}?		{printf("<OCTAL-CONSTANT>"); }
{D}+{IS}?		{printf("<DECIMAL-CONSTANT>"); }
L?'(\\.|[^\\'])+'	{printf("<STRING-CONSTANT>"); }

{D}+{E}{FS}?		{printf("<FLOAT-CONSTANT>"); }
{D}*"."{D}+({E})?{FS}?	{printf("<FLOAT-CONSTANT>"); }
{D}+"."{D}*({E})?{FS}?	{printf("<FLOAT-CONSTANT>"); }

L?\"(\\.|[^\\"])*\"	{printf("<STRING_LITERAL>"); }

"..."			{printf("<ELLIPSIS>"); }
">>="			{printf("<RIGHT_ASSIGN>"); }
"<<="			{printf("<LEFT_ASSIGN>"); }
"+="			{printf("<ADD_ASSIGN>"); }
"-="			{printf("<SUB_ASSIGN>"); }
"*="			{printf("<MUL_ASSIGN>"); }
"/="			{printf("<DIV_ASSIGN>"); }
"%="			{printf("<MOD_ASSIGN>"); }
"&="			{printf("<AND_ASSIGN>"); }
"^="			{printf("<XOR_ASSIGN>"); }
"|="			{printf("<OR_ASSIGN>"); }
">>"			{printf("<RIGHT_OP>"); }
"<<"			{printf("<LEFT_OP>"); }
"++"			{printf("<INC_OP>"); }
"--"			{printf("<DEC_OP>"); }
"->"			{printf("<PTR_OP>"); }
"&&"			{printf("<AND_OP>"); }
"||"			{printf("<OR_OP>"); }
"<="			{printf("<LE_OP>"); }
">="			{printf("<GE_OP>"); }
"=="			{printf("<EQ_OP>"); }
"!="			{printf("<NE_OP>"); }
";"			{printf("<;>"); }
("{"|"<%")		{printf("<{>"); }
("}"|"%>")		{printf("<}>"); }
","			{printf("<,>"); }
":"			{printf("<:>"); }
"="			{printf("<=>"); }
"("			{printf("<(>"); }
")"			{printf("<)>"); }
("["|"<:")		{printf("<[>"); }
("]"|":>")		{printf("<]>"); }
"."			{printf("<.>"); }
"&"			{printf("<&>"); }
"!"			{printf("<!>"); }
"~"			{printf("<~>"); }
"-"			{printf("<->"); }
"+"			{printf("<+>"); }
"*"			{printf("<*>"); }
"/"			{printf("</>"); }
"%"			{printf("<MOD>"); }
"<"			{printf("<GE_OP>"); }
">"			{printf("<LE_OP>"); }
"^"			{printf("<^>"); }
"|"			{printf("< | >"); }
"?"			{printf("<?>"); }

[ \t\v\n\f]		{printf(""); }
.			{printf("<ignore bad characters>"); }

%%
