package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.ironsource.C20517nb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;

/* loaded from: classes10.dex */
public class CSSParser {
    static final String CLASS = "class";
    static final String CSS_MIME_TYPE = "text/css";

    /* renamed from: ID */
    static final String f102040ID = "id";
    private static final int SPECIFICITY_ATTRIBUTE_OR_PSEUDOCLASS = 1000;
    private static final int SPECIFICITY_ELEMENT_OR_PSEUDOELEMENT = 1;
    private static final int SPECIFICITY_ID_ATTRIBUTE = 1000000;
    private static final String TAG = "CSSParser";
    private MediaType deviceMediaType;
    private SVGExternalFileResolver externalFileResolver;
    private boolean inMediaRule;
    private Source source;

    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser$1 */
    /* loaded from: classes10.dex */
    static /* synthetic */ class C386981 {

        /* renamed from: $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$CSSParser$AttribOp */
        static final /* synthetic */ int[] f102041x92fcef3d;

        static {
            int[] iArr = new int[AttribOp.values().length];
            f102041x92fcef3d = iArr;
            try {
                iArr[AttribOp.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102041x92fcef3d[AttribOp.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102041x92fcef3d[AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class Attrib {
        public final String name;
        final AttribOp operation;
        public final String value;

        Attrib(String str, AttribOp attribOp, String str2) {
            this.name = str;
            this.operation = attribOp;
            this.value = str2;
        }
    }

    /* loaded from: classes10.dex */
    enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public interface PseudoClass {
        boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase);
    }

    /* loaded from: classes10.dex */
    static class PseudoClassAnPlusB implements PseudoClass {

        /* renamed from: a */
        private final int f102043a;

        /* renamed from: b */
        private final int f102044b;
        private final boolean isFromStart;
        private final boolean isOfType;
        private final String nodeName;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PseudoClassAnPlusB(int i, int i2, boolean z, boolean z2, String str) {
            this.f102043a = i;
            this.f102044b = i2;
            this.isFromStart = z;
            this.isOfType = z2;
            this.nodeName = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            String str;
            int i;
            int i2;
            int i3;
            if (this.isOfType && this.nodeName == null) {
                str = svgElementBase.getNodeName();
            } else {
                str = this.nodeName;
            }
            SVGBase.SvgContainer svgContainer = svgElementBase.parent;
            if (svgContainer != null) {
                Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                    SVGBase.SvgElementBase svgElementBase2 = (SVGBase.SvgElementBase) it.next();
                    if (svgElementBase2 == svgElementBase) {
                        i = i2;
                    }
                    if (str == null || svgElementBase2.getNodeName().equals(str)) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 1;
            }
            if (this.isFromStart) {
                i3 = i + 1;
            } else {
                i3 = i2 - i;
            }
            int i4 = this.f102043a;
            if (i4 == 0) {
                if (i3 != this.f102044b) {
                    return false;
                }
                return true;
            }
            int i5 = this.f102044b;
            if ((i3 - i5) % i4 != 0) {
                return false;
            }
            if (Integer.signum(i3 - i5) != 0 && Integer.signum(i3 - this.f102044b) != Integer.signum(this.f102043a)) {
                return false;
            }
            return true;
        }

        public String toString() {
            String str;
            if (this.isFromStart) {
                str = "";
            } else {
                str = "last-";
            }
            if (this.isOfType) {
                return String.format(Locale.US, "nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f102043a), Integer.valueOf(this.f102044b), this.nodeName);
            }
            return String.format(Locale.US, "nth-%schild(%dn%+d)", str, Integer.valueOf(this.f102043a), Integer.valueOf(this.f102044b));
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassEmpty implements PseudoClass {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            if (!(svgElementBase instanceof SVGBase.SvgContainer) || ((SVGBase.SvgContainer) svgElementBase).getChildren().size() == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "empty";
        }
    }

    /* loaded from: classes10.dex */
    enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;
        
        private static final Map<String, PseudoClassIdents> cache = new HashMap();

        static {
            PseudoClassIdents[] values;
            for (PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    cache.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static PseudoClassIdents fromString(String str) {
            PseudoClassIdents pseudoClassIdents = cache.get(str);
            if (pseudoClassIdents != null) {
                return pseudoClassIdents;
            }
            return UNSUPPORTED;
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassNot implements PseudoClass {
        private final List<Selector> selectorGroup;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PseudoClassNot(List<Selector> list) {
            this.selectorGroup = list;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int getSpecificity() {
            int i = Integer.MIN_VALUE;
            for (Selector selector : this.selectorGroup) {
                int i2 = selector.specificity;
                if (i2 > i) {
                    i = i2;
                }
            }
            return i;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            for (Selector selector : this.selectorGroup) {
                if (CSSParser.ruleMatch(ruleMatchContext, selector, svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return "not(" + this.selectorGroup + ")";
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassNotSupported implements PseudoClass {
        private final String clazz;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PseudoClassNotSupported(String str) {
            this.clazz = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            return false;
        }

        public String toString() {
            return this.clazz;
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassOnlyChild implements PseudoClass {
        private final boolean isOfType;
        private final String nodeName;

        public PseudoClassOnlyChild(boolean z, String str) {
            this.isOfType = z;
            this.nodeName = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            String str;
            int i;
            if (this.isOfType && this.nodeName == null) {
                str = svgElementBase.getNodeName();
            } else {
                str = this.nodeName;
            }
            SVGBase.SvgContainer svgContainer = svgElementBase.parent;
            if (svgContainer != null) {
                Iterator<SVGBase.SvgObject> it = svgContainer.getChildren().iterator();
                i = 0;
                while (it.hasNext()) {
                    SVGBase.SvgElementBase svgElementBase2 = (SVGBase.SvgElementBase) it.next();
                    if (str == null || svgElementBase2.getNodeName().equals(str)) {
                        i++;
                    }
                }
            } else {
                i = 1;
            }
            if (i != 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            if (this.isOfType) {
                return String.format("only-of-type <%s>", this.nodeName);
            }
            return "only-child";
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassRoot implements PseudoClass {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            if (svgElementBase.parent == null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "root";
        }
    }

    /* loaded from: classes10.dex */
    static class PseudoClassTarget implements PseudoClass {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser.PseudoClass
        public boolean matches(RuleMatchContext ruleMatchContext, SVGBase.SvgElementBase svgElementBase) {
            if (ruleMatchContext == null || svgElementBase != ruleMatchContext.targetElement) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "target";
        }
    }

    /* loaded from: classes10.dex */
    public static class Rule {
        final Selector selector;
        final Source source;
        final Style style;

        Rule(Selector selector, Style style, Source source) {
            this.selector = selector;
            this.style = style;
            this.source = source;
        }

        public String toString() {
            return this.selector + " {...} (src=" + this.source + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class RuleMatchContext {
        SVGBase.SvgElementBase targetElement;

        public String toString() {
            SVGBase.SvgElementBase svgElementBase = this.targetElement;
            if (svgElementBase != null) {
                return String.format("<%s id=\"%s\">", svgElementBase.getNodeName(), this.targetElement.f102088id);
            }
            return "";
        }
    }

    /* loaded from: classes10.dex */
    public static class Ruleset {
        private List<Rule> rules = null;

        void add(Rule rule) {
            if (this.rules == null) {
                this.rules = new LinkedList();
            }
            ListIterator<Rule> listIterator = this.rules.listIterator();
            while (listIterator.hasNext()) {
                int nextIndex = listIterator.nextIndex();
                if (listIterator.next().selector.specificity > rule.selector.specificity) {
                    this.rules.add(nextIndex, rule);
                    return;
                }
            }
            this.rules.add(rule);
        }

        public void addAll(Ruleset ruleset) {
            if (ruleset.rules == null) {
                return;
            }
            if (this.rules == null) {
                this.rules = new LinkedList();
            }
            for (Rule rule : ruleset.rules) {
                add(rule);
            }
        }

        public List<Rule> getRules() {
            return this.rules;
        }

        public boolean isEmpty() {
            List<Rule> list = this.rules;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        public void removeFromSource(Source source) {
            List<Rule> list = this.rules;
            if (list == null) {
                return;
            }
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().source == source) {
                    it.remove();
                }
            }
        }

        int ruleCount() {
            List<Rule> list = this.rules;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.rules == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (Rule rule : this.rules) {
                sb2.append(rule.toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class Selector {
        List<SimpleSelector> simpleSelectors = null;
        int specificity = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void add(SimpleSelector simpleSelector) {
            if (this.simpleSelectors == null) {
                this.simpleSelectors = new ArrayList();
            }
            this.simpleSelectors.add(simpleSelector);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void addedAttributeOrPseudo() {
            this.specificity += 1000;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void addedElement() {
            this.specificity++;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void addedIdAttribute() {
            this.specificity += 1000000;
        }

        SimpleSelector get(int i) {
            return this.simpleSelectors.get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isEmpty() {
            List<SimpleSelector> list = this.simpleSelectors;
            if (list != null && !list.isEmpty()) {
                return false;
            }
            return true;
        }

        int size() {
            List<SimpleSelector> list = this.simpleSelectors;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            for (SimpleSelector simpleSelector : this.simpleSelectors) {
                sb2.append(simpleSelector);
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.specificity);
            sb2.append(']');
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class SimpleSelector {
        Combinator combinator;
        String tag;
        List<Attrib> attribs = null;
        List<PseudoClass> pseudos = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SimpleSelector(Combinator combinator, String str) {
            this.combinator = combinator == null ? Combinator.DESCENDANT : combinator;
            this.tag = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void addAttrib(String str, AttribOp attribOp, String str2) {
            if (this.attribs == null) {
                this.attribs = new ArrayList();
            }
            this.attribs.add(new Attrib(str, attribOp, str2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void addPseudo(PseudoClass pseudoClass) {
            if (this.pseudos == null) {
                this.pseudos = new ArrayList();
            }
            this.pseudos.add(pseudoClass);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Combinator combinator = this.combinator;
            if (combinator == Combinator.CHILD) {
                sb2.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.tag;
            if (str == null) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            sb2.append(str);
            List<Attrib> list = this.attribs;
            if (list != null) {
                for (Attrib attrib : list) {
                    sb2.append('[');
                    sb2.append(attrib.name);
                    int i = C386981.f102041x92fcef3d[attrib.operation.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                sb2.append("|=");
                                sb2.append(attrib.value);
                            }
                        } else {
                            sb2.append("~=");
                            sb2.append(attrib.value);
                        }
                    } else {
                        sb2.append(C20517nb.f52173T);
                        sb2.append(attrib.value);
                    }
                    sb2.append(']');
                }
            }
            List<PseudoClass> list2 = this.pseudos;
            if (list2 != null) {
                for (PseudoClass pseudoClass : list2) {
                    sb2.append(':');
                    sb2.append(pseudoClass);
                }
            }
            return sb2.toString();
        }
    }

    /* loaded from: classes10.dex */
    public enum Source {
        Document,
        RenderOptions
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CSSParser(Source source, SVGExternalFileResolver sVGExternalFileResolver) {
        this(MediaType.screen, source, sVGExternalFileResolver);
    }

    private static int getChildPosition(List<SVGBase.SvgContainer> list, int i, SVGBase.SvgElementBase svgElementBase) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        SVGBase.SvgContainer svgContainer = list.get(i);
        SVGBase.SvgContainer svgContainer2 = svgElementBase.parent;
        if (svgContainer != svgContainer2) {
            return -1;
        }
        for (SVGBase.SvgObject svgObject : svgContainer2.getChildren()) {
            if (svgObject == svgElementBase) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean mediaMatches(String str, MediaType mediaType) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return mediaMatches(parseMediaList(cSSTextScanner), mediaType);
    }

    private void parseAtRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        String nextIdentifier = cSSTextScanner.nextIdentifier();
        cSSTextScanner.skipWhitespace();
        if (nextIdentifier != null) {
            if (!this.inMediaRule && nextIdentifier.equals("media")) {
                List<MediaType> parseMediaList = parseMediaList(cSSTextScanner);
                if (cSSTextScanner.consume('{')) {
                    cSSTextScanner.skipWhitespace();
                    if (mediaMatches(parseMediaList, this.deviceMediaType)) {
                        this.inMediaRule = true;
                        ruleset.addAll(parseRuleset(cSSTextScanner));
                        this.inMediaRule = false;
                    } else {
                        parseRuleset(cSSTextScanner);
                    }
                    if (!cSSTextScanner.empty() && !cSSTextScanner.consume('}')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new CSSParseException("Invalid @media rule: missing rule set");
                }
            } else if (!this.inMediaRule && nextIdentifier.equals("import")) {
                String nextURL = cSSTextScanner.nextURL();
                if (nextURL == null) {
                    nextURL = cSSTextScanner.nextCSSString();
                }
                if (nextURL != null) {
                    cSSTextScanner.skipWhitespace();
                    List<MediaType> parseMediaList2 = parseMediaList(cSSTextScanner);
                    if (!cSSTextScanner.empty() && !cSSTextScanner.consume(';')) {
                        throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                    }
                    if (this.externalFileResolver != null && mediaMatches(parseMediaList2, this.deviceMediaType)) {
                        String resolveCSSStyleSheet = this.externalFileResolver.resolveCSSStyleSheet(nextURL);
                        if (resolveCSSStyleSheet == null) {
                            return;
                        }
                        ruleset.addAll(parse(resolveCSSStyleSheet));
                    }
                } else {
                    throw new CSSParseException("Invalid @import rule: expected string or url()");
                }
            } else {
                warn("Ignoring @%s rule", nextIdentifier);
                skipAtRule(cSSTextScanner);
            }
            cSSTextScanner.skipWhitespace();
            return;
        }
        throw new CSSParseException("Invalid '@' rule");
    }

    public static List<String> parseClassAttribute(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        ArrayList arrayList = null;
        while (!cSSTextScanner.empty()) {
            String nextToken = cSSTextScanner.nextToken();
            if (nextToken != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nextToken);
                cSSTextScanner.skipWhitespace();
            }
        }
        return arrayList;
    }

    private Style parseDeclarations(CSSTextScanner cSSTextScanner) throws CSSParseException {
        Style style = new Style();
        do {
            String nextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.consume(':')) {
                cSSTextScanner.skipWhitespace();
                String nextPropertyValue = cSSTextScanner.nextPropertyValue();
                if (nextPropertyValue != null) {
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.consume('!')) {
                        cSSTextScanner.skipWhitespace();
                        if (cSSTextScanner.consume("important")) {
                            cSSTextScanner.skipWhitespace();
                        } else {
                            throw new CSSParseException("Malformed rule set: found unexpected '!'");
                        }
                    }
                    cSSTextScanner.consume(';');
                    Style.processStyleProperty(style, nextIdentifier, nextPropertyValue, false);
                    cSSTextScanner.skipWhitespace();
                    if (cSSTextScanner.empty()) {
                        break;
                    }
                } else {
                    throw new CSSParseException("Expected property value");
                }
            } else {
                throw new CSSParseException("Expected ':'");
            }
        } while (!cSSTextScanner.consume('}'));
        return style;
    }

    private static List<MediaType> parseMediaList(CSSTextScanner cSSTextScanner) {
        String nextWord;
        ArrayList arrayList = new ArrayList();
        while (!cSSTextScanner.empty() && (nextWord = cSSTextScanner.nextWord()) != null) {
            try {
                arrayList.add(MediaType.valueOf(nextWord));
            } catch (IllegalArgumentException unused) {
            }
            if (!cSSTextScanner.skipCommaWhitespace()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean parseRule(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        List<Selector> nextSelectorGroup = cSSTextScanner.nextSelectorGroup();
        if (nextSelectorGroup != null && !nextSelectorGroup.isEmpty()) {
            if (cSSTextScanner.consume('{')) {
                cSSTextScanner.skipWhitespace();
                Style parseDeclarations = parseDeclarations(cSSTextScanner);
                cSSTextScanner.skipWhitespace();
                for (Selector selector : nextSelectorGroup) {
                    ruleset.add(new Rule(selector, parseDeclarations, this.source));
                }
                return true;
            }
            throw new CSSParseException("Malformed rule block: expected '{'");
        }
        return false;
    }

    private Ruleset parseRuleset(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.empty()) {
            try {
                if (!cSSTextScanner.consume("<!--") && !cSSTextScanner.consume("-->")) {
                    if (cSSTextScanner.consume('@')) {
                        parseAtRule(ruleset, cSSTextScanner);
                    } else if (!parseRule(ruleset, cSSTextScanner)) {
                        break;
                    }
                }
            } catch (CSSParseException e) {
                Log.e(TAG, "CSS parser terminated early due to error: " + e.getMessage());
            }
        }
        return ruleset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ruleMatch(RuleMatchContext ruleMatchContext, Selector selector, SVGBase.SvgElementBase svgElementBase) {
        if (selector.size() == 1) {
            return selectorMatch(ruleMatchContext, selector.get(0), svgElementBase);
        }
        ArrayList arrayList = new ArrayList();
        for (SVGBase.SvgContainer svgContainer = svgElementBase.parent; svgContainer != null; svgContainer = ((SVGBase.SvgObject) svgContainer).parent) {
            arrayList.add(svgContainer);
        }
        Collections.reverse(arrayList);
        return ruleMatch(ruleMatchContext, selector, selector.size() - 1, arrayList, arrayList.size() - 1, svgElementBase);
    }

    private static boolean ruleMatchOnAncestors(RuleMatchContext ruleMatchContext, Selector selector, int i, List<SVGBase.SvgContainer> list, int i2) {
        SimpleSelector simpleSelector = selector.get(i);
        SVGBase.SvgElementBase svgElementBase = (SVGBase.SvgElementBase) list.get(i2);
        if (!selectorMatch(ruleMatchContext, simpleSelector, svgElementBase)) {
            return false;
        }
        Combinator combinator = simpleSelector.combinator;
        if (combinator == Combinator.DESCENDANT) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (combinator == Combinator.CHILD) {
            return ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2 - 1);
        } else {
            int childPosition = getChildPosition(list, i2, svgElementBase);
            if (childPosition <= 0) {
                return false;
            }
            return ruleMatch(ruleMatchContext, selector, i - 1, list, i2, (SVGBase.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
        }
    }

    private static boolean selectorMatch(RuleMatchContext ruleMatchContext, SimpleSelector simpleSelector, SVGBase.SvgElementBase svgElementBase) {
        List<String> list;
        String str = simpleSelector.tag;
        if (str != null && !str.equals(svgElementBase.getNodeName().toLowerCase(Locale.US))) {
            return false;
        }
        List<Attrib> list2 = simpleSelector.attribs;
        if (list2 != null) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                Attrib attrib = simpleSelector.attribs.get(i);
                String str2 = attrib.name;
                str2.hashCode();
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (list = svgElementBase.classNames) == null || !list.contains(attrib.value)) {
                        return false;
                    }
                } else if (!attrib.value.equals(svgElementBase.f102088id)) {
                    return false;
                }
            }
        }
        List<PseudoClass> list3 = simpleSelector.pseudos;
        if (list3 != null) {
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!simpleSelector.pseudos.get(i2).matches(ruleMatchContext, svgElementBase)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private void skipAtRule(CSSTextScanner cSSTextScanner) {
        int i = 0;
        while (!cSSTextScanner.empty()) {
            int intValue = cSSTextScanner.nextChar().intValue();
            if (intValue == 59 && i == 0) {
                return;
            }
            if (intValue == 123) {
                i++;
            } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                return;
            }
        }
    }

    private static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ruleset parse(String str) {
        CSSTextScanner cSSTextScanner = new CSSTextScanner(str);
        cSSTextScanner.skipWhitespace();
        return parseRuleset(cSSTextScanner);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CSSParser(MediaType mediaType, Source source, SVGExternalFileResolver sVGExternalFileResolver) {
        this.inMediaRule = false;
        this.deviceMediaType = mediaType;
        this.source = source;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    private static boolean mediaMatches(List<MediaType> list, MediaType mediaType) {
        if (list.size() == 0) {
            return true;
        }
        for (MediaType mediaType2 : list) {
            if (mediaType2 != MediaType.all) {
                if (mediaType2 == mediaType) {
                }
            }
            return true;
        }
        return false;
    }

    private static boolean ruleMatch(RuleMatchContext ruleMatchContext, Selector selector, int i, List<SVGBase.SvgContainer> list, int i2, SVGBase.SvgElementBase svgElementBase) {
        SimpleSelector simpleSelector = selector.get(i);
        if (selectorMatch(ruleMatchContext, simpleSelector, svgElementBase)) {
            Combinator combinator = simpleSelector.combinator;
            if (combinator == Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            } else if (combinator == Combinator.CHILD) {
                return ruleMatchOnAncestors(ruleMatchContext, selector, i - 1, list, i2);
            } else {
                int childPosition = getChildPosition(list, i2, svgElementBase);
                if (childPosition <= 0) {
                    return false;
                }
                return ruleMatch(ruleMatchContext, selector, i - 1, list, i2, (SVGBase.SvgElementBase) svgElementBase.parent.getChildren().get(childPosition - 1));
            }
        }
        return false;
    }
}
