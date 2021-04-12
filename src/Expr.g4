grammar Expr;

re: union | simple_re;
union: simple_re '|' re;
simple_re: concatenation | basic_re;
concatenation: basic_re simple_re;
basic_re: star | plus | elementary_re;
star: elementary_re '*';
plus: elementary_re '+';
elementary_re: group | any | eos | chara | set;
group: '(' re ')';
any: '.';
eos: '$';
chara: NONMETA | '\'' META;
set: positive_set;
positive_set: '[' set_items ']';
set_items: set_item | set_item set_items;
set_item: range | chara;
range: chara '-' chara;

NONMETA : [A-Za-z]+ ;
META: '.' | '*' | '+' | '?' | '^' | '$' | '(' | ')' | '[' | ']';
NEWLINE:    '\r'? '\n';