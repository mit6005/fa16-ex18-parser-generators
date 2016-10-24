@skip whitespace{
root ::= sum;
sum ::= primitive ('+' primitive)*;
primitive ::= number | '(' sum ')';
}
whitespace ::= [ \t\r\n];
number ::= [0-9]+;