/* The following code was generated by JFlex 1.4.3 on 5/9/22 01:16 */

//ANOTACIONES Y CONFIGURACIONES DE JFLEX

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/9/22 01:16 from the specification file
 * <tt>E:/PC/Usuario/Escritorio/jflex_ejercicio1/src/main/jflex/simple.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\26\2\0\1\27\22\0\1\5\1\24\1\7\5\0"+
    "\1\11\1\12\1\17\1\15\1\25\1\16\1\4\1\3\1\6\11\1"+
    "\1\20\1\30\1\21\1\23\1\22\2\0\1\52\1\2\1\50\1\47"+
    "\1\46\1\37\1\2\1\54\1\31\2\2\1\55\1\2\1\53\3\2"+
    "\1\44\1\2\1\45\1\2\1\51\1\43\3\2\1\0\1\10\4\0"+
    "\1\42\3\2\1\34\1\57\1\35\1\2\1\56\2\2\1\40\1\2"+
    "\1\32\1\41\2\2\1\36\1\60\1\33\6\2\1\13\1\0\1\14"+
    "\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\2\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\1\1\21\1\22\1\5\1\23\7\3"+
    "\1\24\1\25\3\0\1\26\1\27\1\30\1\31\7\3"+
    "\1\32\1\33\1\0\7\3\1\34\1\3\1\35\6\3"+
    "\1\36\1\37\1\40\3\3\1\41\1\42\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\142\0\u0126"+
    "\0\142\0\142\0\142\0\142\0\142\0\142\0\142\0\142"+
    "\0\142\0\u0157\0\u0188\0\u01b9\0\u01ea\0\142\0\u021b\0\142"+
    "\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3"+
    "\0\142\0\u03d4\0\u0405\0\u0126\0\142\0\142\0\142\0\142"+
    "\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\304"+
    "\0\u03d4\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3"+
    "\0\u06e4\0\142\0\u0715\0\304\0\u0746\0\u0777\0\u07a8\0\u07d9"+
    "\0\u080a\0\u083b\0\304\0\304\0\304\0\u086c\0\u089d\0\u08ce"+
    "\0\304\0\304\0\304";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\3\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\7\1\27"+
    "\1\30\1\31\2\5\1\32\2\5\1\33\3\5\1\34"+
    "\2\5\1\35\1\36\6\5\1\37\2\5\7\40\1\41"+
    "\1\3\15\40\2\3\31\40\62\0\1\4\2\0\1\42"+
    "\1\0\1\4\53\0\2\5\3\0\1\5\22\0\30\5"+
    "\17\0\1\43\42\0\1\44\2\0\1\42\1\0\1\44"+
    "\75\0\1\45\60\0\1\46\60\0\1\47\60\0\1\50"+
    "\63\0\1\7\33\0\2\5\3\0\1\5\22\0\1\5"+
    "\1\51\26\5\1\0\2\5\3\0\1\5\22\0\7\5"+
    "\1\52\20\5\1\0\2\5\3\0\1\5\22\0\7\5"+
    "\1\53\20\5\1\0\2\5\3\0\1\5\22\0\13\5"+
    "\1\54\7\5\1\55\4\5\1\0\2\5\3\0\1\5"+
    "\22\0\22\5\1\56\5\5\1\0\2\5\3\0\1\5"+
    "\22\0\15\5\1\57\12\5\1\0\2\5\3\0\1\5"+
    "\22\0\26\5\1\60\1\5\7\40\2\0\15\40\2\0"+
    "\31\40\1\0\1\61\4\0\1\61\52\0\17\43\1\62"+
    "\41\43\1\0\2\5\3\0\1\5\22\0\2\5\1\63"+
    "\25\5\1\0\2\5\3\0\1\5\22\0\27\5\1\64"+
    "\1\0\2\5\3\0\1\5\22\0\10\5\1\65\17\5"+
    "\1\0\2\5\3\0\1\5\22\0\1\66\27\5\1\0"+
    "\2\5\3\0\1\5\22\0\1\67\27\5\1\0\2\5"+
    "\3\0\1\5\22\0\16\5\1\70\11\5\1\0\2\5"+
    "\3\0\1\5\22\0\17\5\1\71\10\5\3\0\1\72"+
    "\56\0\2\5\3\0\1\5\22\0\3\5\1\73\24\5"+
    "\1\0\2\5\3\0\1\5\22\0\3\5\1\74\24\5"+
    "\1\0\2\5\3\0\1\5\22\0\11\5\1\75\16\5"+
    "\1\0\2\5\3\0\1\5\22\0\14\5\1\76\13\5"+
    "\1\0\2\5\3\0\1\5\22\0\24\5\1\77\3\5"+
    "\1\0\2\5\3\0\1\5\22\0\16\5\1\100\11\5"+
    "\1\0\2\5\3\0\1\5\22\0\20\5\1\101\7\5"+
    "\1\0\2\5\3\0\1\5\22\0\4\5\1\102\23\5"+
    "\1\0\2\5\3\0\1\5\22\0\2\5\1\103\25\5"+
    "\1\0\2\5\3\0\1\5\22\0\15\5\1\104\12\5"+
    "\1\0\2\5\3\0\1\5\22\0\15\5\1\105\12\5"+
    "\1\0\2\5\3\0\1\5\22\0\15\5\1\106\12\5"+
    "\1\0\2\5\3\0\1\5\22\0\21\5\1\107\6\5"+
    "\1\0\2\5\3\0\1\5\22\0\3\5\1\110\24\5"+
    "\1\0\2\5\3\0\1\5\22\0\17\5\1\111\10\5"+
    "\1\0\2\5\3\0\1\5\22\0\13\5\1\112\14\5"+
    "\1\0\2\5\3\0\1\5\22\0\5\5\1\113\22\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2303];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\3\1\1\11\1\1\11\11\4\1\1\11"+
    "\1\1\1\11\10\1\1\11\3\0\4\11\11\1\1\0"+
    "\7\1\1\11\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    StringBuffer string = new StringBuffer();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 142) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException, Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 34: 
          { System.out.println("inicio de declaracion variables: " + yytext() + "\n");
          }
        case 36: break;
        case 3: 
          { System.out.println("Identificador: " + yytext() + "\n");
          }
        case 37: break;
        case 23: 
          { System.out.println("operador mayor o igual: " + yytext() + "\n");
          }
        case 38: break;
        case 33: 
          { System.out.println("fin de declarcion variables: " + yytext() + "\n");
          }
        case 39: break;
        case 27: 
          { System.out.println("constante float: " + yytext() + "\n");
          }
        case 40: break;
        case 24: 
          { System.out.println("operador igual condicional: " + yytext() + "\n");
          }
        case 41: break;
        case 35: 
          { System.out.println("declaracion de entero: " + yytext() + "\n");
          }
        case 42: break;
        case 16: 
          { System.out.println("operador mayor: " + yytext() + "\n");
          }
        case 43: break;
        case 9: 
          { System.out.println("llave abre: " + yytext() + "\n");
          }
        case 44: break;
        case 4: 
          { System.out.println("operador division: " + yytext() + "\n");
          }
        case 45: break;
        case 31: 
          { System.out.println("escritura: " + yytext() + "\n");
          }
        case 46: break;
        case 18: 
          { System.out.println("coma: " + yytext() + "\n");
          }
        case 47: break;
        case 26: 
          { System.out.println("condicion if: " + yytext() + "\n");
          }
        case 48: break;
        case 13: 
          { System.out.println("operador multipicacion: " + yytext() + "\n");
          }
        case 49: break;
        case 2: 
          { System.out.println("constante entera: " + yytext() + "\n");
          }
        case 50: break;
        case 32: 
          { System.out.println("bucle while: " + yytext() + "\n");
          }
        case 51: break;
        case 29: 
          { System.out.println("condicion else: " + yytext() + "\n");
          }
        case 52: break;
        case 28: 
          { System.out.println("comentario:\n" + yytext());
          }
        case 53: break;
        case 17: 
          { System.out.println("operador negado: " + yytext() + "\n");
          }
        case 54: break;
        case 30: 
          { System.out.println("declaracion de float: " + yytext() + "\n");
          }
        case 55: break;
        case 19: 
          { System.out.println("punto y coma: " + yytext() + "\n");
          }
        case 56: break;
        case 20: 
          { string.append(yytext());
          }
        case 57: break;
        case 21: 
          { yybegin(YYINITIAL); System.out.println("string: " + string.toString());
          }
        case 58: break;
        case 1: 
          { throw new Exception("Unknown character « " + yytext() + " »");
          }
        case 59: break;
        case 8: 
          { System.out.println("parentesis cierra: " + yytext() + "\n");
          }
        case 60: break;
        case 12: 
          { System.out.println("operador resta: " + yytext() + "\n");
          }
        case 61: break;
        case 6: 
          { yybegin(STRING); string.setLength(0);
          }
        case 62: break;
        case 14: 
          { System.out.println("operador igual: " + yytext() + "\n");
          }
        case 63: break;
        case 15: 
          { System.out.println("operador menor: " + yytext() + "\n");
          }
        case 64: break;
        case 7: 
          { System.out.println("parentesis abre: " + yytext() + "\n");
          }
        case 65: break;
        case 22: 
          { System.out.println("operador menor o igual: " + yytext() + "\n");
          }
        case 66: break;
        case 11: 
          { System.out.println("operador suma: " + yytext() + "\n");
          }
        case 67: break;
        case 10: 
          { System.out.println("llave cierra: " + yytext() + "\n");
          }
        case 68: break;
        case 5: 
          { /* ignore */
          }
        case 69: break;
        case 25: 
          { System.out.println("operador negado_igual: " + yytext() + "\n");
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          scanner = new Lexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
