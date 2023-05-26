
public enum TokenType {
    Const, Void, Else, If, Int, While, Return,
    // 수정: 키워드 추가
    Char, Double, For, Do, Goto, Switch, Case, Break, Default,
    Eof, 
    LeftBrace, RightBrace, LeftBracket, RightBracket,
    LeftParen, RightParen, Semicolon, Comma, Assign, AddAssign, SubAssign, MultAssign, DivAssign, RemAssign,
    Equals, Less, LessEqual, Greater, GreaterEqual,
    Not, NotEqual, Plus, Minus, Multiply, Reminder,
    Increment, Decrement,
    Divide, And, Or, Identifier, IntLiteral,
    // 수정: char/string/double literal type 추가
    CharLiteral, StringLiteral, DoubleLiteral,
    // 수정: ':' 연산자 추가
    Colon
}
