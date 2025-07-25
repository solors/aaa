package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes10.dex */
public class CSSTextScanner extends TextScanner {
    static final Pattern PATTERN_BLOCK_COMMENTS = Pattern.compile("(?s)/\\*.*?\\*/");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.CSSTextScanner$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C386991 {

        /* renamed from: $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$PseudoClassIdents */
        static final /* synthetic */ int[] f102045x161caacb;

        static {
            int[] iArr = new int[CSSParser.PseudoClassIdents.values().length];
            f102045x161caacb = iArr;
            try {
                iArr[CSSParser.PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f102045x161caacb[CSSParser.PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class AnPlusB {

        /* renamed from: a */
        public final int f102046a;

        /* renamed from: b */
        public final int f102047b;

        AnPlusB(int i, int i2) {
            this.f102046a = i;
            this.f102047b = i2;
        }
    }

    public CSSTextScanner(String str) {
        super(PATTERN_BLOCK_COMMENTS.matcher(str).replaceAll(""));
    }

    private int hexChar(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        int i2 = 65;
        if (i < 65 || i > 70) {
            i2 = 97;
            if (i < 97 || i > 102) {
                return -1;
            }
        }
        return (i - i2) + 10;
    }

    private AnPlusB nextAnPlusB() {
        int i;
        IntegerParser integerParser;
        int value;
        AnPlusB anPlusB;
        if (empty()) {
            return null;
        }
        int i2 = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        int i3 = 1;
        if (consume("odd")) {
            anPlusB = new AnPlusB(2, 1);
        } else {
            int i4 = 0;
            if (consume("even")) {
                anPlusB = new AnPlusB(2, 0);
            } else {
                if (!consume('+') && consume('-')) {
                    i = -1;
                } else {
                    i = 1;
                }
                IntegerParser parseInt = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                if (parseInt != null) {
                    this.position = parseInt.getEndPos();
                }
                if (!consume('n') && !consume('N')) {
                    integerParser = parseInt;
                    parseInt = null;
                } else {
                    if (parseInt == null) {
                        parseInt = new IntegerParser(1L, this.position);
                    }
                    skipWhitespace();
                    boolean consume = consume('+');
                    if (!consume && (consume = consume('-'))) {
                        i3 = -1;
                    }
                    if (consume) {
                        skipWhitespace();
                        integerParser = IntegerParser.parseInt(this.input, this.position, this.inputLength, false);
                        if (integerParser != null) {
                            this.position = integerParser.getEndPos();
                        } else {
                            this.position = i2;
                            return null;
                        }
                    } else {
                        integerParser = null;
                    }
                    int i5 = i3;
                    i3 = i;
                    i = i5;
                }
                if (parseInt == null) {
                    value = 0;
                } else {
                    value = i3 * parseInt.value();
                }
                if (integerParser != null) {
                    i4 = i * integerParser.value();
                }
                anPlusB = new AnPlusB(value, i4);
            }
        }
        skipWhitespace();
        if (consume(')')) {
            return anPlusB;
        }
        this.position = i2;
        return null;
    }

    private String nextAttribValue() {
        if (empty()) {
            return null;
        }
        String nextQuotedString = nextQuotedString();
        if (nextQuotedString != null) {
            return nextQuotedString;
        }
        return nextIdentifier();
    }

    private List<String> nextIdentListParam() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        ArrayList arrayList = null;
        do {
            String nextIdentifier = nextIdentifier();
            if (nextIdentifier == null) {
                this.position = i;
                return null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextIdentifier);
            skipWhitespace();
        } while (skipCommaWhitespace());
        if (consume(')')) {
            return arrayList;
        }
        this.position = i;
        return null;
    }

    private List<CSSParser.Selector> nextPseudoNotParam() throws CSSParseException {
        List<CSSParser.SimpleSelector> list;
        List<CSSParser.PseudoClass> list2;
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume('(')) {
            return null;
        }
        skipWhitespace();
        List<CSSParser.Selector> nextSelectorGroup = nextSelectorGroup();
        if (nextSelectorGroup == null) {
            this.position = i;
            return null;
        } else if (!consume(')')) {
            this.position = i;
            return null;
        } else {
            Iterator<CSSParser.Selector> it = nextSelectorGroup.iterator();
            while (it.hasNext() && (list = it.next().simpleSelectors) != null) {
                Iterator<CSSParser.SimpleSelector> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().pseudos) != null) {
                    for (CSSParser.PseudoClass pseudoClass : list2) {
                        if (pseudoClass instanceof CSSParser.PseudoClassNot) {
                            return null;
                        }
                    }
                }
            }
            return nextSelectorGroup;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void parsePseudoClass(CSSParser.Selector selector, CSSParser.SimpleSelector simpleSelector) throws CSSParseException {
        CSSParser.PseudoClass pseudoClassAnPlusB;
        boolean z;
        boolean z2;
        CSSParser.PseudoClassAnPlusB pseudoClassAnPlusB2;
        String nextIdentifier = nextIdentifier();
        if (nextIdentifier != null) {
            CSSParser.PseudoClassIdents fromString = CSSParser.PseudoClassIdents.fromString(nextIdentifier);
            switch (C386991.f102045x161caacb[fromString.ordinal()]) {
                case 1:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, true, false, null);
                    selector.addedAttributeOrPseudo();
                    break;
                case 2:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, false, false, null);
                    selector.addedAttributeOrPseudo();
                    break;
                case 3:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassOnlyChild(false, null);
                    selector.addedAttributeOrPseudo();
                    break;
                case 4:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, true, true, simpleSelector.tag);
                    selector.addedAttributeOrPseudo();
                    break;
                case 5:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassAnPlusB(0, 1, false, true, simpleSelector.tag);
                    selector.addedAttributeOrPseudo();
                    break;
                case 6:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassOnlyChild(true, simpleSelector.tag);
                    selector.addedAttributeOrPseudo();
                    break;
                case 7:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassRoot();
                    selector.addedAttributeOrPseudo();
                    break;
                case 8:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassEmpty();
                    selector.addedAttributeOrPseudo();
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    if (fromString != CSSParser.PseudoClassIdents.nth_child && fromString != CSSParser.PseudoClassIdents.nth_of_type) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (fromString != CSSParser.PseudoClassIdents.nth_of_type && fromString != CSSParser.PseudoClassIdents.nth_last_of_type) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    AnPlusB nextAnPlusB = nextAnPlusB();
                    if (nextAnPlusB != null) {
                        CSSParser.PseudoClassAnPlusB pseudoClassAnPlusB3 = new CSSParser.PseudoClassAnPlusB(nextAnPlusB.f102046a, nextAnPlusB.f102047b, z, z2, simpleSelector.tag);
                        selector.addedAttributeOrPseudo();
                        pseudoClassAnPlusB2 = pseudoClassAnPlusB3;
                        pseudoClassAnPlusB = pseudoClassAnPlusB2;
                        break;
                    } else {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                    }
                    break;
                case 13:
                    List<CSSParser.Selector> nextPseudoNotParam = nextPseudoNotParam();
                    if (nextPseudoNotParam != null) {
                        CSSParser.PseudoClassNot pseudoClassNot = new CSSParser.PseudoClassNot(nextPseudoNotParam);
                        selector.specificity = pseudoClassNot.getSpecificity();
                        pseudoClassAnPlusB2 = pseudoClassNot;
                        pseudoClassAnPlusB = pseudoClassAnPlusB2;
                        break;
                    } else {
                        throw new CSSParseException("Invalid or missing parameter section for pseudo class: " + nextIdentifier);
                    }
                case 14:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassTarget();
                    selector.addedAttributeOrPseudo();
                    break;
                case 15:
                    nextIdentListParam();
                    pseudoClassAnPlusB = new CSSParser.PseudoClassNotSupported(nextIdentifier);
                    selector.addedAttributeOrPseudo();
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    pseudoClassAnPlusB = new CSSParser.PseudoClassNotSupported(nextIdentifier);
                    selector.addedAttributeOrPseudo();
                    break;
                default:
                    throw new CSSParseException("Unsupported pseudo class: " + nextIdentifier);
            }
            simpleSelector.addPseudo(pseudoClassAnPlusB);
            return;
        }
        throw new CSSParseException("Invalid pseudo class");
    }

    private int scanForIdentifier() {
        int i;
        if (empty()) {
            return this.position;
        }
        int i2 = this.position;
        int charAt = this.input.charAt(i2);
        if (charAt == 45) {
            charAt = advanceChar();
        }
        if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 45 && charAt != 95 && charAt < 128)) {
            i = i2;
        } else {
            int advanceChar = advanceChar();
            while (true) {
                if ((advanceChar < 65 || advanceChar > 90) && ((advanceChar < 97 || advanceChar > 122) && ((advanceChar < 48 || advanceChar > 57) && advanceChar != 45 && advanceChar != 95 && advanceChar < 128))) {
                    break;
                }
                advanceChar = advanceChar();
            }
            i = this.position;
        }
        this.position = i2;
        return i;
    }

    public String nextCSSString() {
        int hexChar;
        if (empty()) {
            return null;
        }
        char charAt = this.input.charAt(this.position);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.position++;
        int intValue = nextChar().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = nextChar().intValue();
                if (intValue != -1) {
                    if (intValue != 10 && intValue != 13 && intValue != 12) {
                        int hexChar2 = hexChar(intValue);
                        if (hexChar2 != -1) {
                            for (int i = 1; i <= 5 && (hexChar = hexChar((intValue = nextChar().intValue()))) != -1; i++) {
                                hexChar2 = (hexChar2 * 16) + hexChar;
                            }
                            sb2.append((char) hexChar2);
                        }
                    } else {
                        intValue = nextChar().intValue();
                    }
                }
            }
            sb2.append((char) intValue);
            intValue = nextChar().intValue();
        }
        return sb2.toString();
    }

    public String nextIdentifier() {
        int scanForIdentifier = scanForIdentifier();
        int i = this.position;
        if (scanForIdentifier == i) {
            return null;
        }
        String substring = this.input.substring(i, scanForIdentifier);
        this.position = scanForIdentifier;
        return substring;
    }

    String nextLegacyURL() {
        char charAt;
        int hexChar;
        StringBuilder sb2 = new StringBuilder();
        while (!empty() && (charAt = this.input.charAt(this.position)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !isWhitespace(charAt) && !Character.isISOControl((int) charAt)) {
            this.position++;
            if (charAt == '\\') {
                if (!empty()) {
                    String str = this.input;
                    int i = this.position;
                    this.position = i + 1;
                    charAt = str.charAt(i);
                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                        int hexChar2 = hexChar(charAt);
                        if (hexChar2 != -1) {
                            for (int i2 = 1; i2 <= 5 && !empty() && (hexChar = hexChar(this.input.charAt(this.position))) != -1; i2++) {
                                this.position++;
                                hexChar2 = (hexChar2 * 16) + hexChar;
                            }
                            sb2.append((char) hexChar2);
                        }
                    }
                }
            }
            sb2.append(charAt);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String nextPropertyValue() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        int charAt = this.input.charAt(i);
        int i2 = i;
        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !isEOL(charAt)) {
            if (!isWhitespace(charAt)) {
                i2 = this.position + 1;
            }
            charAt = advanceChar();
        }
        if (this.position > i) {
            return this.input.substring(i, i2);
        }
        this.position = i;
        return null;
    }

    public List<CSSParser.Selector> nextSelectorGroup() throws CSSParseException {
        if (empty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        CSSParser.Selector selector = new CSSParser.Selector();
        while (!empty() && nextSimpleSelector(selector)) {
            if (skipCommaWhitespace()) {
                arrayList.add(selector);
                selector = new CSSParser.Selector();
            }
        }
        if (!selector.isEmpty()) {
            arrayList.add(selector);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean nextSimpleSelector(net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.Selector r11) throws net.pubnative.lite.sdk.utils.svgparser.utils.CSSParseException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.utils.svgparser.utils.CSSTextScanner.nextSimpleSelector(net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser$Selector):boolean");
    }

    public String nextURL() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        if (!consume("url(")) {
            return null;
        }
        skipWhitespace();
        String nextCSSString = nextCSSString();
        if (nextCSSString == null) {
            nextCSSString = nextLegacyURL();
        }
        if (nextCSSString == null) {
            this.position = i;
            return null;
        }
        skipWhitespace();
        if (!empty() && !consume(")")) {
            this.position = i;
            return null;
        }
        return nextCSSString;
    }
}
