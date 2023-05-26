
public class Token {

    private static final int KEYWORDS = TokenType.Eof.ordinal();

    private static final String[] reserved = new String[KEYWORDS];
    private static Token[] token = new Token[KEYWORDS];

    public static final Token eofTok = new Token(TokenType.Eof, "<<EOF>>");
    public static final Token constTok = new Token(TokenType.Const, "const");
    public static final Token returnTok = new Token(TokenType.Return, "return");
    public static final Token voidTok = new Token(TokenType.Void, "void");
    public static final Token elseTok = new Token(TokenType.Else, "else");
    public static final Token ifTok = new Token(TokenType.If, "if");
    public static final Token intTok = new Token(TokenType.Int, "int");
    public static final Token whileTok = new Token(TokenType.While, "while");

    // 수정: 키워드에 대한 토큰 추가
    public static final Token charTok = new Token(TokenType.Char, "char");
    public static final Token doubleTok = new Token(TokenType.Double, "double");
    public static final Token forTok = new Token(TokenType.While, "for");
    public static final Token doTok = new Token(TokenType.While, "do");
    public static final Token gotoTok = new Token(TokenType.While, "goto");
    public static final Token switchTok = new Token(TokenType.While, "switch");
    public static final Token caseTok = new Token(TokenType.While, "case");
    public static final Token breakTok = new Token(TokenType.While, "break");
    public static final Token defaultTok = new Token(TokenType.While, "default");

    public static final Token leftBraceTok = new Token(TokenType.LeftBrace, "{");
    public static final Token rightBraceTok = new Token(TokenType.RightBrace, "}");
    public static final Token leftBracketTok = new Token(TokenType.LeftBracket, "[");
    public static final Token rightBracketTok = new Token(TokenType.RightBracket, "]");
    public static final Token leftParenTok = new Token(TokenType.LeftParen, "(");
    public static final Token rightParenTok = new Token(TokenType.RightParen, ")");
    public static final Token semicolonTok = new Token(TokenType.Semicolon, ";");
    public static final Token commaTok = new Token(TokenType.Comma, ",");
    public static final Token assignTok = new Token(TokenType.Assign, "=");
    public static final Token eqeqTok = new Token(TokenType.Equals, "==");
    public static final Token ltTok = new Token(TokenType.Less, "<");
    public static final Token lteqTok = new Token(TokenType.LessEqual, "<=");
    public static final Token gtTok = new Token(TokenType.Greater, ">");
    public static final Token gteqTok = new Token(TokenType.GreaterEqual, ">=");
    public static final Token notTok = new Token(TokenType.Not, "!");
    public static final Token noteqTok = new Token(TokenType.NotEqual, "!=");
    public static final Token plusTok = new Token(TokenType.Plus, "+");
    public static final Token minusTok = new Token(TokenType.Minus, "-");
    public static final Token multiplyTok = new Token(TokenType.Multiply, "*");
    public static final Token divideTok = new Token(TokenType.Divide, "/");
    public static final Token reminderTok = new Token(TokenType.Reminder, "%");
    public static final Token addAssignTok = new Token(TokenType.AddAssign, "+=");
    public static final Token subAssignTok = new Token(TokenType.SubAssign, "-=");
    public static final Token multAssignTok = new Token(TokenType.MultAssign, "*=");
    public static final Token divAssignTok = new Token(TokenType.DivAssign, "/=");
    public static final Token remAssignTok = new Token(TokenType.RemAssign, "%=");
    public static final Token incrementTok = new Token(TokenType.Increment, "++");
    public static final Token decrementTok = new Token(TokenType.Decrement, "--");
    public static final Token andTok = new Token(TokenType.And, "&&");
    public static final Token orTok = new Token(TokenType.Or, "||");
    // 수정: ':' 연산자 토큰
    public static final Token colonTok = new Token(TokenType.Colon, ":");

    private TokenType type;
    private String value = "";

    private Token (TokenType t, String v) {
        type = t;
        value = v;
        if (t.compareTo(TokenType.Eof) < 0) {
            int ti = t.ordinal();
            reserved[ti] = v;
            token[ti] = this;
        }
    }

    public TokenType type( ) { return type; }

    public String value( ) { return value; }

    public static Token keyword  ( String name ) {
        char ch = name.charAt(0);
        if (ch >= 'A' && ch <= 'Z') return mkIdentTok(name);
        for (int i = 0; i < KEYWORDS; i++)
           if (name.equals(reserved[i]))  return token[i];
        return mkIdentTok(name);
    } // keyword

    public static Token mkIdentTok (String name) {
        return new Token(TokenType.Identifier, name);
    }

    public static Token mkIntLiteral(String name) {
        return new Token(TokenType.IntLiteral, name);
    }
    
    // 추가: char literal 토큰 반환
    public static Token mkCharLiteral(String name) {
        return new Token(TokenType.CharLiteral, name);
    }
    // 추가: string literal 토큰 반환
    public static Token mkStringLiteral(String name) {
        return new Token(TokenType.StringLiteral, name);
    }

    // 추가: double literal 토칸 반환
    public static Token mkDoubleLiteral(String name) {
        return new Token(TokenType.DoubleLiteral, name);
    }

    public String toString() {
        int ti = type.ordinal();
        // if (type.compareTo(TokenType.Identifier) < 0) return value;
        // 수정: 모든 토큰을 출력하기 위해 윗줄 주석 처리
        return value + " (" + ti + ", "+ value + ", ";
    } // toString

    public static void main (String[] args) {
    	// test
        System.out.println(eofTok);
        System.out.println(whileTok);
    }
} // Token
