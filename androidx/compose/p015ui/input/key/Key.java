package androidx.compose.p015ui.input.key;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.solver.widgets.Optimizer;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Key.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.key.Key */
/* loaded from: classes.dex */
public final class Key {
    private final long keyCode;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unknown = Key_androidKt.Key(0);
    private static final long SoftLeft = Key_androidKt.Key(1);
    private static final long SoftRight = Key_androidKt.Key(2);
    private static final long Home = Key_androidKt.Key(3);
    private static final long Back = Key_androidKt.Key(4);
    private static final long Help = Key_androidKt.Key(259);
    private static final long NavigatePrevious = Key_androidKt.Key(260);
    private static final long NavigateNext = Key_androidKt.Key(261);
    private static final long NavigateIn = Key_androidKt.Key(262);
    private static final long NavigateOut = Key_androidKt.Key(Optimizer.OPTIMIZATION_STANDARD);
    private static final long SystemNavigationUp = Key_androidKt.Key(280);
    private static final long SystemNavigationDown = Key_androidKt.Key(281);
    private static final long SystemNavigationLeft = Key_androidKt.Key(282);
    private static final long SystemNavigationRight = Key_androidKt.Key(283);
    private static final long Call = Key_androidKt.Key(5);
    private static final long EndCall = Key_androidKt.Key(6);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionCenter = Key_androidKt.Key(23);
    private static final long DirectionUpLeft = Key_androidKt.Key(268);
    private static final long DirectionDownLeft = Key_androidKt.Key(269);
    private static final long DirectionUpRight = Key_androidKt.Key(270);
    private static final long DirectionDownRight = Key_androidKt.Key(271);
    private static final long VolumeUp = Key_androidKt.Key(24);
    private static final long VolumeDown = Key_androidKt.Key(25);
    private static final long Power = Key_androidKt.Key(26);
    private static final long Camera = Key_androidKt.Key(27);
    private static final long Clear = Key_androidKt.Key(28);
    private static final long Zero = Key_androidKt.Key(7);
    private static final long One = Key_androidKt.Key(8);
    private static final long Two = Key_androidKt.Key(9);
    private static final long Three = Key_androidKt.Key(10);
    private static final long Four = Key_androidKt.Key(11);
    private static final long Five = Key_androidKt.Key(12);
    private static final long Six = Key_androidKt.Key(13);
    private static final long Seven = Key_androidKt.Key(14);
    private static final long Eight = Key_androidKt.Key(15);
    private static final long Nine = Key_androidKt.Key(16);
    private static final long Plus = Key_androidKt.Key(81);
    private static final long Minus = Key_androidKt.Key(69);
    private static final long Multiply = Key_androidKt.Key(17);
    private static final long Equals = Key_androidKt.Key(70);
    private static final long Pound = Key_androidKt.Key(18);

    /* renamed from: A */
    private static final long f456A = Key_androidKt.Key(29);

    /* renamed from: B */
    private static final long f458B = Key_androidKt.Key(30);

    /* renamed from: C */
    private static final long f459C = Key_androidKt.Key(31);

    /* renamed from: D */
    private static final long f460D = Key_androidKt.Key(32);

    /* renamed from: E */
    private static final long f461E = Key_androidKt.Key(33);

    /* renamed from: F */
    private static final long f462F = Key_androidKt.Key(34);

    /* renamed from: G */
    private static final long f472G = Key_androidKt.Key(35);

    /* renamed from: H */
    private static final long f473H = Key_androidKt.Key(36);

    /* renamed from: I */
    private static final long f474I = Key_androidKt.Key(37);

    /* renamed from: J */
    private static final long f475J = Key_androidKt.Key(38);

    /* renamed from: K */
    private static final long f476K = Key_androidKt.Key(39);

    /* renamed from: L */
    private static final long f477L = Key_androidKt.Key(40);

    /* renamed from: M */
    private static final long f478M = Key_androidKt.Key(41);

    /* renamed from: N */
    private static final long f479N = Key_androidKt.Key(42);

    /* renamed from: O */
    private static final long f480O = Key_androidKt.Key(43);

    /* renamed from: P */
    private static final long f481P = Key_androidKt.Key(44);

    /* renamed from: Q */
    private static final long f482Q = Key_androidKt.Key(45);

    /* renamed from: R */
    private static final long f483R = Key_androidKt.Key(46);

    /* renamed from: S */
    private static final long f485S = Key_androidKt.Key(47);

    /* renamed from: T */
    private static final long f486T = Key_androidKt.Key(48);

    /* renamed from: U */
    private static final long f488U = Key_androidKt.Key(49);

    /* renamed from: V */
    private static final long f489V = Key_androidKt.Key(50);

    /* renamed from: W */
    private static final long f490W = Key_androidKt.Key(51);

    /* renamed from: X */
    private static final long f491X = Key_androidKt.Key(52);

    /* renamed from: Y */
    private static final long f492Y = Key_androidKt.Key(53);

    /* renamed from: Z */
    private static final long f493Z = Key_androidKt.Key(54);
    private static final long Comma = Key_androidKt.Key(55);
    private static final long Period = Key_androidKt.Key(56);
    private static final long AltLeft = Key_androidKt.Key(57);
    private static final long AltRight = Key_androidKt.Key(58);
    private static final long ShiftLeft = Key_androidKt.Key(59);
    private static final long ShiftRight = Key_androidKt.Key(60);
    private static final long Tab = Key_androidKt.Key(61);
    private static final long Spacebar = Key_androidKt.Key(62);
    private static final long Symbol = Key_androidKt.Key(63);
    private static final long Browser = Key_androidKt.Key(64);
    private static final long Envelope = Key_androidKt.Key(65);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(112);
    private static final long Escape = Key_androidKt.Key(111);
    private static final long CtrlLeft = Key_androidKt.Key(113);
    private static final long CtrlRight = Key_androidKt.Key(114);
    private static final long CapsLock = Key_androidKt.Key(115);
    private static final long ScrollLock = Key_androidKt.Key(116);
    private static final long MetaLeft = Key_androidKt.Key(117);
    private static final long MetaRight = Key_androidKt.Key(118);
    private static final long Function = Key_androidKt.Key(119);
    private static final long PrintScreen = Key_androidKt.Key(120);
    private static final long Break = Key_androidKt.Key(121);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Grave = Key_androidKt.Key(68);
    private static final long LeftBracket = Key_androidKt.Key(71);
    private static final long RightBracket = Key_androidKt.Key(72);
    private static final long Slash = Key_androidKt.Key(76);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long Semicolon = Key_androidKt.Key(74);
    private static final long Apostrophe = Key_androidKt.Key(75);

    /* renamed from: At */
    private static final long f457At = Key_androidKt.Key(77);
    private static final long Number = Key_androidKt.Key(78);
    private static final long HeadsetHook = Key_androidKt.Key(79);
    private static final long Focus = Key_androidKt.Key(80);
    private static final long Menu = Key_androidKt.Key(82);
    private static final long Notification = Key_androidKt.Key(83);
    private static final long Search = Key_androidKt.Key(84);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long PictureSymbols = Key_androidKt.Key(94);
    private static final long SwitchCharset = Key_androidKt.Key(95);
    private static final long ButtonA = Key_androidKt.Key(96);
    private static final long ButtonB = Key_androidKt.Key(97);
    private static final long ButtonC = Key_androidKt.Key(98);
    private static final long ButtonX = Key_androidKt.Key(99);
    private static final long ButtonY = Key_androidKt.Key(100);
    private static final long ButtonZ = Key_androidKt.Key(101);
    private static final long ButtonL1 = Key_androidKt.Key(102);
    private static final long ButtonR1 = Key_androidKt.Key(103);
    private static final long ButtonL2 = Key_androidKt.Key(104);
    private static final long ButtonR2 = Key_androidKt.Key(105);
    private static final long ButtonThumbLeft = Key_androidKt.Key(106);
    private static final long ButtonThumbRight = Key_androidKt.Key(107);
    private static final long ButtonStart = Key_androidKt.Key(108);
    private static final long ButtonSelect = Key_androidKt.Key(109);
    private static final long ButtonMode = Key_androidKt.Key(110);
    private static final long Button1 = Key_androidKt.Key(188);
    private static final long Button2 = Key_androidKt.Key(189);
    private static final long Button3 = Key_androidKt.Key(FacebookRequestErrorClassification.EC_INVALID_TOKEN);
    private static final long Button4 = Key_androidKt.Key(191);
    private static final long Button5 = Key_androidKt.Key(192);
    private static final long Button6 = Key_androidKt.Key(193);
    private static final long Button7 = Key_androidKt.Key(194);
    private static final long Button8 = Key_androidKt.Key(195);
    private static final long Button9 = Key_androidKt.Key(196);
    private static final long Button10 = Key_androidKt.Key(197);
    private static final long Button11 = Key_androidKt.Key(198);
    private static final long Button12 = Key_androidKt.Key(199);
    private static final long Button13 = Key_androidKt.Key(200);
    private static final long Button14 = Key_androidKt.Key(201);
    private static final long Button15 = Key_androidKt.Key(202);
    private static final long Button16 = Key_androidKt.Key(203);
    private static final long Forward = Key_androidKt.Key(125);

    /* renamed from: F1 */
    private static final long f463F1 = Key_androidKt.Key(131);

    /* renamed from: F2 */
    private static final long f464F2 = Key_androidKt.Key(132);

    /* renamed from: F3 */
    private static final long f465F3 = Key_androidKt.Key(133);

    /* renamed from: F4 */
    private static final long f466F4 = Key_androidKt.Key(134);

    /* renamed from: F5 */
    private static final long f467F5 = Key_androidKt.Key(135);

    /* renamed from: F6 */
    private static final long f468F6 = Key_androidKt.Key(136);

    /* renamed from: F7 */
    private static final long f469F7 = Key_androidKt.Key(137);

    /* renamed from: F8 */
    private static final long f470F8 = Key_androidKt.Key(138);

    /* renamed from: F9 */
    private static final long f471F9 = Key_androidKt.Key(139);
    private static final long F10 = Key_androidKt.Key(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
    private static final long F11 = Key_androidKt.Key(ErrorCode.CODE_INIT_DEVICE_ERROR);
    private static final long F12 = Key_androidKt.Key(142);
    private static final long NumLock = Key_androidKt.Key(143);
    private static final long NumPad0 = Key_androidKt.Key(144);
    private static final long NumPad1 = Key_androidKt.Key(145);
    private static final long NumPad2 = Key_androidKt.Key(146);
    private static final long NumPad3 = Key_androidKt.Key(147);
    private static final long NumPad4 = Key_androidKt.Key(148);
    private static final long NumPad5 = Key_androidKt.Key(149);
    private static final long NumPad6 = Key_androidKt.Key(150);
    private static final long NumPad7 = Key_androidKt.Key(ErrorCode.CODE_INIT_UNKNOWN_ERROR);
    private static final long NumPad8 = Key_androidKt.Key(ErrorCode.CODE_NOT_TRACK_STATUS);
    private static final long NumPad9 = Key_androidKt.Key(153);
    private static final long NumPadDivide = Key_androidKt.Key(154);
    private static final long NumPadMultiply = Key_androidKt.Key(155);
    private static final long NumPadSubtract = Key_androidKt.Key(156);
    private static final long NumPadAdd = Key_androidKt.Key(157);
    private static final long NumPadDot = Key_androidKt.Key(158);
    private static final long NumPadComma = Key_androidKt.Key(159);
    private static final long NumPadEnter = Key_androidKt.Key(160);
    private static final long NumPadEquals = Key_androidKt.Key(161);
    private static final long NumPadLeftParenthesis = Key_androidKt.Key(162);
    private static final long NumPadRightParenthesis = Key_androidKt.Key(163);
    private static final long MediaPlay = Key_androidKt.Key(126);
    private static final long MediaPause = Key_androidKt.Key(127);
    private static final long MediaPlayPause = Key_androidKt.Key(85);
    private static final long MediaStop = Key_androidKt.Key(86);
    private static final long MediaRecord = Key_androidKt.Key(130);
    private static final long MediaNext = Key_androidKt.Key(87);
    private static final long MediaPrevious = Key_androidKt.Key(88);
    private static final long MediaRewind = Key_androidKt.Key(89);
    private static final long MediaFastForward = Key_androidKt.Key(90);
    private static final long MediaClose = Key_androidKt.Key(128);
    private static final long MediaAudioTrack = Key_androidKt.Key(222);
    private static final long MediaEject = Key_androidKt.Key(129);
    private static final long MediaTopMenu = Key_androidKt.Key(226);
    private static final long MediaSkipForward = Key_androidKt.Key(272);
    private static final long MediaSkipBackward = Key_androidKt.Key(FloatWebTemplateView.FLOAT_MINI_CARD);
    private static final long MediaStepForward = Key_androidKt.Key(274);
    private static final long MediaStepBackward = Key_androidKt.Key(275);
    private static final long MicrophoneMute = Key_androidKt.Key(91);
    private static final long VolumeMute = Key_androidKt.Key(164);
    private static final long Info = Key_androidKt.Key(165);
    private static final long ChannelUp = Key_androidKt.Key(166);
    private static final long ChannelDown = Key_androidKt.Key(167);
    private static final long ZoomIn = Key_androidKt.Key(168);
    private static final long ZoomOut = Key_androidKt.Key(169);

    /* renamed from: Tv */
    private static final long f487Tv = Key_androidKt.Key(170);
    private static final long Window = Key_androidKt.Key(171);
    private static final long Guide = Key_androidKt.Key(172);
    private static final long Dvr = Key_androidKt.Key(173);
    private static final long Bookmark = Key_androidKt.Key(174);
    private static final long Captions = Key_androidKt.Key(175);
    private static final long Settings = Key_androidKt.Key(176);
    private static final long TvPower = Key_androidKt.Key(177);
    private static final long TvInput = Key_androidKt.Key(178);
    private static final long SetTopBoxPower = Key_androidKt.Key(179);
    private static final long SetTopBoxInput = Key_androidKt.Key(180);
    private static final long AvReceiverPower = Key_androidKt.Key(181);
    private static final long AvReceiverInput = Key_androidKt.Key(182);
    private static final long ProgramRed = Key_androidKt.Key(183);
    private static final long ProgramGreen = Key_androidKt.Key(184);
    private static final long ProgramYellow = Key_androidKt.Key(185);
    private static final long ProgramBlue = Key_androidKt.Key(186);
    private static final long AppSwitch = Key_androidKt.Key(187);
    private static final long LanguageSwitch = Key_androidKt.Key(204);
    private static final long MannerMode = Key_androidKt.Key(205);
    private static final long Toggle2D3D = Key_androidKt.Key(206);
    private static final long Contacts = Key_androidKt.Key(207);
    private static final long Calendar = Key_androidKt.Key(208);
    private static final long Music = Key_androidKt.Key(209);
    private static final long Calculator = Key_androidKt.Key(210);
    private static final long ZenkakuHankaru = Key_androidKt.Key(211);
    private static final long Eisu = Key_androidKt.Key(212);
    private static final long Muhenkan = Key_androidKt.Key(213);
    private static final long Henkan = Key_androidKt.Key(214);
    private static final long KatakanaHiragana = Key_androidKt.Key(215);
    private static final long Yen = Key_androidKt.Key(216);

    /* renamed from: Ro */
    private static final long f484Ro = Key_androidKt.Key(217);
    private static final long Kana = Key_androidKt.Key(218);
    private static final long Assist = Key_androidKt.Key(219);
    private static final long BrightnessDown = Key_androidKt.Key(220);
    private static final long BrightnessUp = Key_androidKt.Key(221);
    private static final long Sleep = Key_androidKt.Key(223);
    private static final long WakeUp = Key_androidKt.Key(224);
    private static final long SoftSleep = Key_androidKt.Key(276);
    private static final long Pairing = Key_androidKt.Key(225);
    private static final long LastChannel = Key_androidKt.Key(229);
    private static final long TvDataService = Key_androidKt.Key(230);
    private static final long VoiceAssist = Key_androidKt.Key(231);
    private static final long TvRadioService = Key_androidKt.Key(232);
    private static final long TvTeletext = Key_androidKt.Key(233);
    private static final long TvNumberEntry = Key_androidKt.Key(234);
    private static final long TvTerrestrialAnalog = Key_androidKt.Key(235);
    private static final long TvTerrestrialDigital = Key_androidKt.Key(236);
    private static final long TvSatellite = Key_androidKt.Key(237);
    private static final long TvSatelliteBs = Key_androidKt.Key(238);
    private static final long TvSatelliteCs = Key_androidKt.Key(239);
    private static final long TvSatelliteService = Key_androidKt.Key(240);
    private static final long TvNetwork = Key_androidKt.Key(241);
    private static final long TvAntennaCable = Key_androidKt.Key(242);
    private static final long TvInputHdmi1 = Key_androidKt.Key(243);
    private static final long TvInputHdmi2 = Key_androidKt.Key(244);
    private static final long TvInputHdmi3 = Key_androidKt.Key(245);
    private static final long TvInputHdmi4 = Key_androidKt.Key(246);
    private static final long TvInputComposite1 = Key_androidKt.Key(247);
    private static final long TvInputComposite2 = Key_androidKt.Key(248);
    private static final long TvInputComponent1 = Key_androidKt.Key(249);
    private static final long TvInputComponent2 = Key_androidKt.Key(250);
    private static final long TvInputVga1 = Key_androidKt.Key(251);
    private static final long TvAudioDescription = Key_androidKt.Key(252);
    private static final long TvAudioDescriptionMixingVolumeUp = Key_androidKt.Key(253);
    private static final long TvAudioDescriptionMixingVolumeDown = Key_androidKt.Key(254);
    private static final long TvZoomMode = Key_androidKt.Key(255);
    private static final long TvContentsMenu = Key_androidKt.Key(256);
    private static final long TvMediaContextMenu = Key_androidKt.Key(257);
    private static final long TvTimerProgramming = Key_androidKt.Key(258);
    private static final long StemPrimary = Key_androidKt.Key(264);
    private static final long Stem1 = Key_androidKt.Key(265);
    private static final long Stem2 = Key_androidKt.Key(266);
    private static final long Stem3 = Key_androidKt.Key(267);
    private static final long AllApps = Key_androidKt.Key(284);
    private static final long Refresh = Key_androidKt.Key(285);
    private static final long ThumbsUp = Key_androidKt.Key(286);
    private static final long ThumbsDown = Key_androidKt.Key(287);
    private static final long ProfileSwitch = Key_androidKt.Key(288);

    private /* synthetic */ Key(long j) {
        this.keyCode = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Key m108163boximpl(long j) {
        return new Key(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m108165equalsimpl(long j, Object obj) {
        if (!(obj instanceof Key) || j != ((Key) obj).m108169unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m108166equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m108167hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m108168toStringimpl(long j) {
        return "Key code: " + j;
    }

    public boolean equals(Object obj) {
        return m108165equalsimpl(this.keyCode, obj);
    }

    public final long getKeyCode() {
        return this.keyCode;
    }

    public int hashCode() {
        return m108167hashCodeimpl(this.keyCode);
    }

    @NotNull
    public String toString() {
        return m108168toStringimpl(this.keyCode);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m108169unboximpl() {
        return this.keyCode;
    }

    /* compiled from: Key.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.key.Key$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getA-EK5gGoQ  reason: not valid java name */
        public final long m108457getAEK5gGoQ() {
            return Key.f456A;
        }

        /* renamed from: getAllApps-EK5gGoQ  reason: not valid java name */
        public final long m108458getAllAppsEK5gGoQ() {
            return Key.AllApps;
        }

        /* renamed from: getAltLeft-EK5gGoQ  reason: not valid java name */
        public final long m108459getAltLeftEK5gGoQ() {
            return Key.AltLeft;
        }

        /* renamed from: getAltRight-EK5gGoQ  reason: not valid java name */
        public final long m108460getAltRightEK5gGoQ() {
            return Key.AltRight;
        }

        /* renamed from: getApostrophe-EK5gGoQ  reason: not valid java name */
        public final long m108461getApostropheEK5gGoQ() {
            return Key.Apostrophe;
        }

        /* renamed from: getAppSwitch-EK5gGoQ  reason: not valid java name */
        public final long m108462getAppSwitchEK5gGoQ() {
            return Key.AppSwitch;
        }

        /* renamed from: getAssist-EK5gGoQ  reason: not valid java name */
        public final long m108463getAssistEK5gGoQ() {
            return Key.Assist;
        }

        /* renamed from: getAt-EK5gGoQ  reason: not valid java name */
        public final long m108464getAtEK5gGoQ() {
            return Key.f457At;
        }

        /* renamed from: getAvReceiverInput-EK5gGoQ  reason: not valid java name */
        public final long m108465getAvReceiverInputEK5gGoQ() {
            return Key.AvReceiverInput;
        }

        /* renamed from: getAvReceiverPower-EK5gGoQ  reason: not valid java name */
        public final long m108466getAvReceiverPowerEK5gGoQ() {
            return Key.AvReceiverPower;
        }

        /* renamed from: getB-EK5gGoQ  reason: not valid java name */
        public final long m108467getBEK5gGoQ() {
            return Key.f458B;
        }

        /* renamed from: getBack-EK5gGoQ  reason: not valid java name */
        public final long m108468getBackEK5gGoQ() {
            return Key.Back;
        }

        /* renamed from: getBackslash-EK5gGoQ  reason: not valid java name */
        public final long m108469getBackslashEK5gGoQ() {
            return Key.Backslash;
        }

        /* renamed from: getBackspace-EK5gGoQ  reason: not valid java name */
        public final long m108470getBackspaceEK5gGoQ() {
            return Key.Backspace;
        }

        /* renamed from: getBookmark-EK5gGoQ  reason: not valid java name */
        public final long m108471getBookmarkEK5gGoQ() {
            return Key.Bookmark;
        }

        /* renamed from: getBreak-EK5gGoQ  reason: not valid java name */
        public final long m108472getBreakEK5gGoQ() {
            return Key.Break;
        }

        /* renamed from: getBrightnessDown-EK5gGoQ  reason: not valid java name */
        public final long m108473getBrightnessDownEK5gGoQ() {
            return Key.BrightnessDown;
        }

        /* renamed from: getBrightnessUp-EK5gGoQ  reason: not valid java name */
        public final long m108474getBrightnessUpEK5gGoQ() {
            return Key.BrightnessUp;
        }

        /* renamed from: getBrowser-EK5gGoQ  reason: not valid java name */
        public final long m108475getBrowserEK5gGoQ() {
            return Key.Browser;
        }

        /* renamed from: getButton1-EK5gGoQ  reason: not valid java name */
        public final long m108476getButton1EK5gGoQ() {
            return Key.Button1;
        }

        /* renamed from: getButton10-EK5gGoQ  reason: not valid java name */
        public final long m108477getButton10EK5gGoQ() {
            return Key.Button10;
        }

        /* renamed from: getButton11-EK5gGoQ  reason: not valid java name */
        public final long m108478getButton11EK5gGoQ() {
            return Key.Button11;
        }

        /* renamed from: getButton12-EK5gGoQ  reason: not valid java name */
        public final long m108479getButton12EK5gGoQ() {
            return Key.Button12;
        }

        /* renamed from: getButton13-EK5gGoQ  reason: not valid java name */
        public final long m108480getButton13EK5gGoQ() {
            return Key.Button13;
        }

        /* renamed from: getButton14-EK5gGoQ  reason: not valid java name */
        public final long m108481getButton14EK5gGoQ() {
            return Key.Button14;
        }

        /* renamed from: getButton15-EK5gGoQ  reason: not valid java name */
        public final long m108482getButton15EK5gGoQ() {
            return Key.Button15;
        }

        /* renamed from: getButton16-EK5gGoQ  reason: not valid java name */
        public final long m108483getButton16EK5gGoQ() {
            return Key.Button16;
        }

        /* renamed from: getButton2-EK5gGoQ  reason: not valid java name */
        public final long m108484getButton2EK5gGoQ() {
            return Key.Button2;
        }

        /* renamed from: getButton3-EK5gGoQ  reason: not valid java name */
        public final long m108485getButton3EK5gGoQ() {
            return Key.Button3;
        }

        /* renamed from: getButton4-EK5gGoQ  reason: not valid java name */
        public final long m108486getButton4EK5gGoQ() {
            return Key.Button4;
        }

        /* renamed from: getButton5-EK5gGoQ  reason: not valid java name */
        public final long m108487getButton5EK5gGoQ() {
            return Key.Button5;
        }

        /* renamed from: getButton6-EK5gGoQ  reason: not valid java name */
        public final long m108488getButton6EK5gGoQ() {
            return Key.Button6;
        }

        /* renamed from: getButton7-EK5gGoQ  reason: not valid java name */
        public final long m108489getButton7EK5gGoQ() {
            return Key.Button7;
        }

        /* renamed from: getButton8-EK5gGoQ  reason: not valid java name */
        public final long m108490getButton8EK5gGoQ() {
            return Key.Button8;
        }

        /* renamed from: getButton9-EK5gGoQ  reason: not valid java name */
        public final long m108491getButton9EK5gGoQ() {
            return Key.Button9;
        }

        /* renamed from: getButtonA-EK5gGoQ  reason: not valid java name */
        public final long m108492getButtonAEK5gGoQ() {
            return Key.ButtonA;
        }

        /* renamed from: getButtonB-EK5gGoQ  reason: not valid java name */
        public final long m108493getButtonBEK5gGoQ() {
            return Key.ButtonB;
        }

        /* renamed from: getButtonC-EK5gGoQ  reason: not valid java name */
        public final long m108494getButtonCEK5gGoQ() {
            return Key.ButtonC;
        }

        /* renamed from: getButtonL1-EK5gGoQ  reason: not valid java name */
        public final long m108495getButtonL1EK5gGoQ() {
            return Key.ButtonL1;
        }

        /* renamed from: getButtonL2-EK5gGoQ  reason: not valid java name */
        public final long m108496getButtonL2EK5gGoQ() {
            return Key.ButtonL2;
        }

        /* renamed from: getButtonMode-EK5gGoQ  reason: not valid java name */
        public final long m108497getButtonModeEK5gGoQ() {
            return Key.ButtonMode;
        }

        /* renamed from: getButtonR1-EK5gGoQ  reason: not valid java name */
        public final long m108498getButtonR1EK5gGoQ() {
            return Key.ButtonR1;
        }

        /* renamed from: getButtonR2-EK5gGoQ  reason: not valid java name */
        public final long m108499getButtonR2EK5gGoQ() {
            return Key.ButtonR2;
        }

        /* renamed from: getButtonSelect-EK5gGoQ  reason: not valid java name */
        public final long m108500getButtonSelectEK5gGoQ() {
            return Key.ButtonSelect;
        }

        /* renamed from: getButtonStart-EK5gGoQ  reason: not valid java name */
        public final long m108501getButtonStartEK5gGoQ() {
            return Key.ButtonStart;
        }

        /* renamed from: getButtonThumbLeft-EK5gGoQ  reason: not valid java name */
        public final long m108502getButtonThumbLeftEK5gGoQ() {
            return Key.ButtonThumbLeft;
        }

        /* renamed from: getButtonThumbRight-EK5gGoQ  reason: not valid java name */
        public final long m108503getButtonThumbRightEK5gGoQ() {
            return Key.ButtonThumbRight;
        }

        /* renamed from: getButtonX-EK5gGoQ  reason: not valid java name */
        public final long m108504getButtonXEK5gGoQ() {
            return Key.ButtonX;
        }

        /* renamed from: getButtonY-EK5gGoQ  reason: not valid java name */
        public final long m108505getButtonYEK5gGoQ() {
            return Key.ButtonY;
        }

        /* renamed from: getButtonZ-EK5gGoQ  reason: not valid java name */
        public final long m108506getButtonZEK5gGoQ() {
            return Key.ButtonZ;
        }

        /* renamed from: getC-EK5gGoQ  reason: not valid java name */
        public final long m108507getCEK5gGoQ() {
            return Key.f459C;
        }

        /* renamed from: getCalculator-EK5gGoQ  reason: not valid java name */
        public final long m108508getCalculatorEK5gGoQ() {
            return Key.Calculator;
        }

        /* renamed from: getCalendar-EK5gGoQ  reason: not valid java name */
        public final long m108509getCalendarEK5gGoQ() {
            return Key.Calendar;
        }

        /* renamed from: getCall-EK5gGoQ  reason: not valid java name */
        public final long m108510getCallEK5gGoQ() {
            return Key.Call;
        }

        /* renamed from: getCamera-EK5gGoQ  reason: not valid java name */
        public final long m108511getCameraEK5gGoQ() {
            return Key.Camera;
        }

        /* renamed from: getCapsLock-EK5gGoQ  reason: not valid java name */
        public final long m108512getCapsLockEK5gGoQ() {
            return Key.CapsLock;
        }

        /* renamed from: getCaptions-EK5gGoQ  reason: not valid java name */
        public final long m108513getCaptionsEK5gGoQ() {
            return Key.Captions;
        }

        /* renamed from: getChannelDown-EK5gGoQ  reason: not valid java name */
        public final long m108514getChannelDownEK5gGoQ() {
            return Key.ChannelDown;
        }

        /* renamed from: getChannelUp-EK5gGoQ  reason: not valid java name */
        public final long m108515getChannelUpEK5gGoQ() {
            return Key.ChannelUp;
        }

        /* renamed from: getClear-EK5gGoQ  reason: not valid java name */
        public final long m108516getClearEK5gGoQ() {
            return Key.Clear;
        }

        /* renamed from: getComma-EK5gGoQ  reason: not valid java name */
        public final long m108517getCommaEK5gGoQ() {
            return Key.Comma;
        }

        /* renamed from: getContacts-EK5gGoQ  reason: not valid java name */
        public final long m108518getContactsEK5gGoQ() {
            return Key.Contacts;
        }

        /* renamed from: getCopy-EK5gGoQ  reason: not valid java name */
        public final long m108519getCopyEK5gGoQ() {
            return Key.Copy;
        }

        /* renamed from: getCtrlLeft-EK5gGoQ  reason: not valid java name */
        public final long m108520getCtrlLeftEK5gGoQ() {
            return Key.CtrlLeft;
        }

        /* renamed from: getCtrlRight-EK5gGoQ  reason: not valid java name */
        public final long m108521getCtrlRightEK5gGoQ() {
            return Key.CtrlRight;
        }

        /* renamed from: getCut-EK5gGoQ  reason: not valid java name */
        public final long m108522getCutEK5gGoQ() {
            return Key.Cut;
        }

        /* renamed from: getD-EK5gGoQ  reason: not valid java name */
        public final long m108523getDEK5gGoQ() {
            return Key.f460D;
        }

        /* renamed from: getDelete-EK5gGoQ  reason: not valid java name */
        public final long m108524getDeleteEK5gGoQ() {
            return Key.Delete;
        }

        /* renamed from: getDirectionCenter-EK5gGoQ  reason: not valid java name */
        public final long m108525getDirectionCenterEK5gGoQ() {
            return Key.DirectionCenter;
        }

        /* renamed from: getDirectionDown-EK5gGoQ  reason: not valid java name */
        public final long m108526getDirectionDownEK5gGoQ() {
            return Key.DirectionDown;
        }

        /* renamed from: getDirectionDownLeft-EK5gGoQ  reason: not valid java name */
        public final long m108527getDirectionDownLeftEK5gGoQ() {
            return Key.DirectionDownLeft;
        }

        /* renamed from: getDirectionDownRight-EK5gGoQ  reason: not valid java name */
        public final long m108528getDirectionDownRightEK5gGoQ() {
            return Key.DirectionDownRight;
        }

        /* renamed from: getDirectionLeft-EK5gGoQ  reason: not valid java name */
        public final long m108529getDirectionLeftEK5gGoQ() {
            return Key.DirectionLeft;
        }

        /* renamed from: getDirectionRight-EK5gGoQ  reason: not valid java name */
        public final long m108530getDirectionRightEK5gGoQ() {
            return Key.DirectionRight;
        }

        /* renamed from: getDirectionUp-EK5gGoQ  reason: not valid java name */
        public final long m108531getDirectionUpEK5gGoQ() {
            return Key.DirectionUp;
        }

        /* renamed from: getDirectionUpLeft-EK5gGoQ  reason: not valid java name */
        public final long m108532getDirectionUpLeftEK5gGoQ() {
            return Key.DirectionUpLeft;
        }

        /* renamed from: getDirectionUpRight-EK5gGoQ  reason: not valid java name */
        public final long m108533getDirectionUpRightEK5gGoQ() {
            return Key.DirectionUpRight;
        }

        /* renamed from: getDvr-EK5gGoQ  reason: not valid java name */
        public final long m108534getDvrEK5gGoQ() {
            return Key.Dvr;
        }

        /* renamed from: getE-EK5gGoQ  reason: not valid java name */
        public final long m108535getEEK5gGoQ() {
            return Key.f461E;
        }

        /* renamed from: getEight-EK5gGoQ  reason: not valid java name */
        public final long m108536getEightEK5gGoQ() {
            return Key.Eight;
        }

        /* renamed from: getEisu-EK5gGoQ  reason: not valid java name */
        public final long m108537getEisuEK5gGoQ() {
            return Key.Eisu;
        }

        /* renamed from: getEndCall-EK5gGoQ  reason: not valid java name */
        public final long m108538getEndCallEK5gGoQ() {
            return Key.EndCall;
        }

        /* renamed from: getEnter-EK5gGoQ  reason: not valid java name */
        public final long m108539getEnterEK5gGoQ() {
            return Key.Enter;
        }

        /* renamed from: getEnvelope-EK5gGoQ  reason: not valid java name */
        public final long m108540getEnvelopeEK5gGoQ() {
            return Key.Envelope;
        }

        /* renamed from: getEquals-EK5gGoQ  reason: not valid java name */
        public final long m108541getEqualsEK5gGoQ() {
            return Key.Equals;
        }

        /* renamed from: getEscape-EK5gGoQ  reason: not valid java name */
        public final long m108542getEscapeEK5gGoQ() {
            return Key.Escape;
        }

        /* renamed from: getF-EK5gGoQ  reason: not valid java name */
        public final long m108543getFEK5gGoQ() {
            return Key.f462F;
        }

        /* renamed from: getF1-EK5gGoQ  reason: not valid java name */
        public final long m108544getF1EK5gGoQ() {
            return Key.f463F1;
        }

        /* renamed from: getF10-EK5gGoQ  reason: not valid java name */
        public final long m108545getF10EK5gGoQ() {
            return Key.F10;
        }

        /* renamed from: getF11-EK5gGoQ  reason: not valid java name */
        public final long m108546getF11EK5gGoQ() {
            return Key.F11;
        }

        /* renamed from: getF12-EK5gGoQ  reason: not valid java name */
        public final long m108547getF12EK5gGoQ() {
            return Key.F12;
        }

        /* renamed from: getF2-EK5gGoQ  reason: not valid java name */
        public final long m108548getF2EK5gGoQ() {
            return Key.f464F2;
        }

        /* renamed from: getF3-EK5gGoQ  reason: not valid java name */
        public final long m108549getF3EK5gGoQ() {
            return Key.f465F3;
        }

        /* renamed from: getF4-EK5gGoQ  reason: not valid java name */
        public final long m108550getF4EK5gGoQ() {
            return Key.f466F4;
        }

        /* renamed from: getF5-EK5gGoQ  reason: not valid java name */
        public final long m108551getF5EK5gGoQ() {
            return Key.f467F5;
        }

        /* renamed from: getF6-EK5gGoQ  reason: not valid java name */
        public final long m108552getF6EK5gGoQ() {
            return Key.f468F6;
        }

        /* renamed from: getF7-EK5gGoQ  reason: not valid java name */
        public final long m108553getF7EK5gGoQ() {
            return Key.f469F7;
        }

        /* renamed from: getF8-EK5gGoQ  reason: not valid java name */
        public final long m108554getF8EK5gGoQ() {
            return Key.f470F8;
        }

        /* renamed from: getF9-EK5gGoQ  reason: not valid java name */
        public final long m108555getF9EK5gGoQ() {
            return Key.f471F9;
        }

        /* renamed from: getFive-EK5gGoQ  reason: not valid java name */
        public final long m108556getFiveEK5gGoQ() {
            return Key.Five;
        }

        /* renamed from: getFocus-EK5gGoQ  reason: not valid java name */
        public final long m108557getFocusEK5gGoQ() {
            return Key.Focus;
        }

        /* renamed from: getForward-EK5gGoQ  reason: not valid java name */
        public final long m108558getForwardEK5gGoQ() {
            return Key.Forward;
        }

        /* renamed from: getFour-EK5gGoQ  reason: not valid java name */
        public final long m108559getFourEK5gGoQ() {
            return Key.Four;
        }

        /* renamed from: getFunction-EK5gGoQ  reason: not valid java name */
        public final long m108560getFunctionEK5gGoQ() {
            return Key.Function;
        }

        /* renamed from: getG-EK5gGoQ  reason: not valid java name */
        public final long m108561getGEK5gGoQ() {
            return Key.f472G;
        }

        /* renamed from: getGrave-EK5gGoQ  reason: not valid java name */
        public final long m108562getGraveEK5gGoQ() {
            return Key.Grave;
        }

        /* renamed from: getGuide-EK5gGoQ  reason: not valid java name */
        public final long m108563getGuideEK5gGoQ() {
            return Key.Guide;
        }

        /* renamed from: getH-EK5gGoQ  reason: not valid java name */
        public final long m108564getHEK5gGoQ() {
            return Key.f473H;
        }

        /* renamed from: getHeadsetHook-EK5gGoQ  reason: not valid java name */
        public final long m108565getHeadsetHookEK5gGoQ() {
            return Key.HeadsetHook;
        }

        /* renamed from: getHelp-EK5gGoQ  reason: not valid java name */
        public final long m108566getHelpEK5gGoQ() {
            return Key.Help;
        }

        /* renamed from: getHenkan-EK5gGoQ  reason: not valid java name */
        public final long m108567getHenkanEK5gGoQ() {
            return Key.Henkan;
        }

        /* renamed from: getHome-EK5gGoQ  reason: not valid java name */
        public final long m108568getHomeEK5gGoQ() {
            return Key.Home;
        }

        /* renamed from: getI-EK5gGoQ  reason: not valid java name */
        public final long m108569getIEK5gGoQ() {
            return Key.f474I;
        }

        /* renamed from: getInfo-EK5gGoQ  reason: not valid java name */
        public final long m108570getInfoEK5gGoQ() {
            return Key.Info;
        }

        /* renamed from: getInsert-EK5gGoQ  reason: not valid java name */
        public final long m108571getInsertEK5gGoQ() {
            return Key.Insert;
        }

        /* renamed from: getJ-EK5gGoQ  reason: not valid java name */
        public final long m108572getJEK5gGoQ() {
            return Key.f475J;
        }

        /* renamed from: getK-EK5gGoQ  reason: not valid java name */
        public final long m108573getKEK5gGoQ() {
            return Key.f476K;
        }

        /* renamed from: getKana-EK5gGoQ  reason: not valid java name */
        public final long m108574getKanaEK5gGoQ() {
            return Key.Kana;
        }

        /* renamed from: getKatakanaHiragana-EK5gGoQ  reason: not valid java name */
        public final long m108575getKatakanaHiraganaEK5gGoQ() {
            return Key.KatakanaHiragana;
        }

        /* renamed from: getL-EK5gGoQ  reason: not valid java name */
        public final long m108576getLEK5gGoQ() {
            return Key.f477L;
        }

        /* renamed from: getLanguageSwitch-EK5gGoQ  reason: not valid java name */
        public final long m108577getLanguageSwitchEK5gGoQ() {
            return Key.LanguageSwitch;
        }

        /* renamed from: getLastChannel-EK5gGoQ  reason: not valid java name */
        public final long m108578getLastChannelEK5gGoQ() {
            return Key.LastChannel;
        }

        /* renamed from: getLeftBracket-EK5gGoQ  reason: not valid java name */
        public final long m108579getLeftBracketEK5gGoQ() {
            return Key.LeftBracket;
        }

        /* renamed from: getM-EK5gGoQ  reason: not valid java name */
        public final long m108580getMEK5gGoQ() {
            return Key.f478M;
        }

        /* renamed from: getMannerMode-EK5gGoQ  reason: not valid java name */
        public final long m108581getMannerModeEK5gGoQ() {
            return Key.MannerMode;
        }

        /* renamed from: getMediaAudioTrack-EK5gGoQ  reason: not valid java name */
        public final long m108582getMediaAudioTrackEK5gGoQ() {
            return Key.MediaAudioTrack;
        }

        /* renamed from: getMediaClose-EK5gGoQ  reason: not valid java name */
        public final long m108583getMediaCloseEK5gGoQ() {
            return Key.MediaClose;
        }

        /* renamed from: getMediaEject-EK5gGoQ  reason: not valid java name */
        public final long m108584getMediaEjectEK5gGoQ() {
            return Key.MediaEject;
        }

        /* renamed from: getMediaFastForward-EK5gGoQ  reason: not valid java name */
        public final long m108585getMediaFastForwardEK5gGoQ() {
            return Key.MediaFastForward;
        }

        /* renamed from: getMediaNext-EK5gGoQ  reason: not valid java name */
        public final long m108586getMediaNextEK5gGoQ() {
            return Key.MediaNext;
        }

        /* renamed from: getMediaPause-EK5gGoQ  reason: not valid java name */
        public final long m108587getMediaPauseEK5gGoQ() {
            return Key.MediaPause;
        }

        /* renamed from: getMediaPlay-EK5gGoQ  reason: not valid java name */
        public final long m108588getMediaPlayEK5gGoQ() {
            return Key.MediaPlay;
        }

        /* renamed from: getMediaPlayPause-EK5gGoQ  reason: not valid java name */
        public final long m108589getMediaPlayPauseEK5gGoQ() {
            return Key.MediaPlayPause;
        }

        /* renamed from: getMediaPrevious-EK5gGoQ  reason: not valid java name */
        public final long m108590getMediaPreviousEK5gGoQ() {
            return Key.MediaPrevious;
        }

        /* renamed from: getMediaRecord-EK5gGoQ  reason: not valid java name */
        public final long m108591getMediaRecordEK5gGoQ() {
            return Key.MediaRecord;
        }

        /* renamed from: getMediaRewind-EK5gGoQ  reason: not valid java name */
        public final long m108592getMediaRewindEK5gGoQ() {
            return Key.MediaRewind;
        }

        /* renamed from: getMediaSkipBackward-EK5gGoQ  reason: not valid java name */
        public final long m108593getMediaSkipBackwardEK5gGoQ() {
            return Key.MediaSkipBackward;
        }

        /* renamed from: getMediaSkipForward-EK5gGoQ  reason: not valid java name */
        public final long m108594getMediaSkipForwardEK5gGoQ() {
            return Key.MediaSkipForward;
        }

        /* renamed from: getMediaStepBackward-EK5gGoQ  reason: not valid java name */
        public final long m108595getMediaStepBackwardEK5gGoQ() {
            return Key.MediaStepBackward;
        }

        /* renamed from: getMediaStepForward-EK5gGoQ  reason: not valid java name */
        public final long m108596getMediaStepForwardEK5gGoQ() {
            return Key.MediaStepForward;
        }

        /* renamed from: getMediaStop-EK5gGoQ  reason: not valid java name */
        public final long m108597getMediaStopEK5gGoQ() {
            return Key.MediaStop;
        }

        /* renamed from: getMediaTopMenu-EK5gGoQ  reason: not valid java name */
        public final long m108598getMediaTopMenuEK5gGoQ() {
            return Key.MediaTopMenu;
        }

        /* renamed from: getMenu-EK5gGoQ  reason: not valid java name */
        public final long m108599getMenuEK5gGoQ() {
            return Key.Menu;
        }

        /* renamed from: getMetaLeft-EK5gGoQ  reason: not valid java name */
        public final long m108600getMetaLeftEK5gGoQ() {
            return Key.MetaLeft;
        }

        /* renamed from: getMetaRight-EK5gGoQ  reason: not valid java name */
        public final long m108601getMetaRightEK5gGoQ() {
            return Key.MetaRight;
        }

        /* renamed from: getMicrophoneMute-EK5gGoQ  reason: not valid java name */
        public final long m108602getMicrophoneMuteEK5gGoQ() {
            return Key.MicrophoneMute;
        }

        /* renamed from: getMinus-EK5gGoQ  reason: not valid java name */
        public final long m108603getMinusEK5gGoQ() {
            return Key.Minus;
        }

        /* renamed from: getMoveEnd-EK5gGoQ  reason: not valid java name */
        public final long m108604getMoveEndEK5gGoQ() {
            return Key.MoveEnd;
        }

        /* renamed from: getMoveHome-EK5gGoQ  reason: not valid java name */
        public final long m108605getMoveHomeEK5gGoQ() {
            return Key.MoveHome;
        }

        /* renamed from: getMuhenkan-EK5gGoQ  reason: not valid java name */
        public final long m108606getMuhenkanEK5gGoQ() {
            return Key.Muhenkan;
        }

        /* renamed from: getMultiply-EK5gGoQ  reason: not valid java name */
        public final long m108607getMultiplyEK5gGoQ() {
            return Key.Multiply;
        }

        /* renamed from: getMusic-EK5gGoQ  reason: not valid java name */
        public final long m108608getMusicEK5gGoQ() {
            return Key.Music;
        }

        /* renamed from: getN-EK5gGoQ  reason: not valid java name */
        public final long m108609getNEK5gGoQ() {
            return Key.f479N;
        }

        /* renamed from: getNavigateIn-EK5gGoQ  reason: not valid java name */
        public final long m108610getNavigateInEK5gGoQ() {
            return Key.NavigateIn;
        }

        /* renamed from: getNavigateNext-EK5gGoQ  reason: not valid java name */
        public final long m108611getNavigateNextEK5gGoQ() {
            return Key.NavigateNext;
        }

        /* renamed from: getNavigateOut-EK5gGoQ  reason: not valid java name */
        public final long m108612getNavigateOutEK5gGoQ() {
            return Key.NavigateOut;
        }

        /* renamed from: getNavigatePrevious-EK5gGoQ  reason: not valid java name */
        public final long m108613getNavigatePreviousEK5gGoQ() {
            return Key.NavigatePrevious;
        }

        /* renamed from: getNine-EK5gGoQ  reason: not valid java name */
        public final long m108614getNineEK5gGoQ() {
            return Key.Nine;
        }

        /* renamed from: getNotification-EK5gGoQ  reason: not valid java name */
        public final long m108615getNotificationEK5gGoQ() {
            return Key.Notification;
        }

        /* renamed from: getNumLock-EK5gGoQ  reason: not valid java name */
        public final long m108616getNumLockEK5gGoQ() {
            return Key.NumLock;
        }

        /* renamed from: getNumPad0-EK5gGoQ  reason: not valid java name */
        public final long m108617getNumPad0EK5gGoQ() {
            return Key.NumPad0;
        }

        /* renamed from: getNumPad1-EK5gGoQ  reason: not valid java name */
        public final long m108618getNumPad1EK5gGoQ() {
            return Key.NumPad1;
        }

        /* renamed from: getNumPad2-EK5gGoQ  reason: not valid java name */
        public final long m108619getNumPad2EK5gGoQ() {
            return Key.NumPad2;
        }

        /* renamed from: getNumPad3-EK5gGoQ  reason: not valid java name */
        public final long m108620getNumPad3EK5gGoQ() {
            return Key.NumPad3;
        }

        /* renamed from: getNumPad4-EK5gGoQ  reason: not valid java name */
        public final long m108621getNumPad4EK5gGoQ() {
            return Key.NumPad4;
        }

        /* renamed from: getNumPad5-EK5gGoQ  reason: not valid java name */
        public final long m108622getNumPad5EK5gGoQ() {
            return Key.NumPad5;
        }

        /* renamed from: getNumPad6-EK5gGoQ  reason: not valid java name */
        public final long m108623getNumPad6EK5gGoQ() {
            return Key.NumPad6;
        }

        /* renamed from: getNumPad7-EK5gGoQ  reason: not valid java name */
        public final long m108624getNumPad7EK5gGoQ() {
            return Key.NumPad7;
        }

        /* renamed from: getNumPad8-EK5gGoQ  reason: not valid java name */
        public final long m108625getNumPad8EK5gGoQ() {
            return Key.NumPad8;
        }

        /* renamed from: getNumPad9-EK5gGoQ  reason: not valid java name */
        public final long m108626getNumPad9EK5gGoQ() {
            return Key.NumPad9;
        }

        /* renamed from: getNumPadAdd-EK5gGoQ  reason: not valid java name */
        public final long m108627getNumPadAddEK5gGoQ() {
            return Key.NumPadAdd;
        }

        /* renamed from: getNumPadComma-EK5gGoQ  reason: not valid java name */
        public final long m108628getNumPadCommaEK5gGoQ() {
            return Key.NumPadComma;
        }

        /* renamed from: getNumPadDivide-EK5gGoQ  reason: not valid java name */
        public final long m108629getNumPadDivideEK5gGoQ() {
            return Key.NumPadDivide;
        }

        /* renamed from: getNumPadDot-EK5gGoQ  reason: not valid java name */
        public final long m108630getNumPadDotEK5gGoQ() {
            return Key.NumPadDot;
        }

        /* renamed from: getNumPadEnter-EK5gGoQ  reason: not valid java name */
        public final long m108631getNumPadEnterEK5gGoQ() {
            return Key.NumPadEnter;
        }

        /* renamed from: getNumPadEquals-EK5gGoQ  reason: not valid java name */
        public final long m108632getNumPadEqualsEK5gGoQ() {
            return Key.NumPadEquals;
        }

        /* renamed from: getNumPadLeftParenthesis-EK5gGoQ  reason: not valid java name */
        public final long m108633getNumPadLeftParenthesisEK5gGoQ() {
            return Key.NumPadLeftParenthesis;
        }

        /* renamed from: getNumPadMultiply-EK5gGoQ  reason: not valid java name */
        public final long m108634getNumPadMultiplyEK5gGoQ() {
            return Key.NumPadMultiply;
        }

        /* renamed from: getNumPadRightParenthesis-EK5gGoQ  reason: not valid java name */
        public final long m108635getNumPadRightParenthesisEK5gGoQ() {
            return Key.NumPadRightParenthesis;
        }

        /* renamed from: getNumPadSubtract-EK5gGoQ  reason: not valid java name */
        public final long m108636getNumPadSubtractEK5gGoQ() {
            return Key.NumPadSubtract;
        }

        /* renamed from: getNumber-EK5gGoQ  reason: not valid java name */
        public final long m108637getNumberEK5gGoQ() {
            return Key.Number;
        }

        /* renamed from: getO-EK5gGoQ  reason: not valid java name */
        public final long m108638getOEK5gGoQ() {
            return Key.f480O;
        }

        /* renamed from: getOne-EK5gGoQ  reason: not valid java name */
        public final long m108639getOneEK5gGoQ() {
            return Key.One;
        }

        /* renamed from: getP-EK5gGoQ  reason: not valid java name */
        public final long m108640getPEK5gGoQ() {
            return Key.f481P;
        }

        /* renamed from: getPageDown-EK5gGoQ  reason: not valid java name */
        public final long m108641getPageDownEK5gGoQ() {
            return Key.PageDown;
        }

        /* renamed from: getPageUp-EK5gGoQ  reason: not valid java name */
        public final long m108642getPageUpEK5gGoQ() {
            return Key.PageUp;
        }

        /* renamed from: getPairing-EK5gGoQ  reason: not valid java name */
        public final long m108643getPairingEK5gGoQ() {
            return Key.Pairing;
        }

        /* renamed from: getPaste-EK5gGoQ  reason: not valid java name */
        public final long m108644getPasteEK5gGoQ() {
            return Key.Paste;
        }

        /* renamed from: getPeriod-EK5gGoQ  reason: not valid java name */
        public final long m108645getPeriodEK5gGoQ() {
            return Key.Period;
        }

        /* renamed from: getPictureSymbols-EK5gGoQ  reason: not valid java name */
        public final long m108646getPictureSymbolsEK5gGoQ() {
            return Key.PictureSymbols;
        }

        /* renamed from: getPlus-EK5gGoQ  reason: not valid java name */
        public final long m108647getPlusEK5gGoQ() {
            return Key.Plus;
        }

        /* renamed from: getPound-EK5gGoQ  reason: not valid java name */
        public final long m108648getPoundEK5gGoQ() {
            return Key.Pound;
        }

        /* renamed from: getPower-EK5gGoQ  reason: not valid java name */
        public final long m108649getPowerEK5gGoQ() {
            return Key.Power;
        }

        /* renamed from: getPrintScreen-EK5gGoQ  reason: not valid java name */
        public final long m108650getPrintScreenEK5gGoQ() {
            return Key.PrintScreen;
        }

        /* renamed from: getProfileSwitch-EK5gGoQ  reason: not valid java name */
        public final long m108651getProfileSwitchEK5gGoQ() {
            return Key.ProfileSwitch;
        }

        /* renamed from: getProgramBlue-EK5gGoQ  reason: not valid java name */
        public final long m108652getProgramBlueEK5gGoQ() {
            return Key.ProgramBlue;
        }

        /* renamed from: getProgramGreen-EK5gGoQ  reason: not valid java name */
        public final long m108653getProgramGreenEK5gGoQ() {
            return Key.ProgramGreen;
        }

        /* renamed from: getProgramRed-EK5gGoQ  reason: not valid java name */
        public final long m108654getProgramRedEK5gGoQ() {
            return Key.ProgramRed;
        }

        /* renamed from: getProgramYellow-EK5gGoQ  reason: not valid java name */
        public final long m108655getProgramYellowEK5gGoQ() {
            return Key.ProgramYellow;
        }

        /* renamed from: getQ-EK5gGoQ  reason: not valid java name */
        public final long m108656getQEK5gGoQ() {
            return Key.f482Q;
        }

        /* renamed from: getR-EK5gGoQ  reason: not valid java name */
        public final long m108657getREK5gGoQ() {
            return Key.f483R;
        }

        /* renamed from: getRefresh-EK5gGoQ  reason: not valid java name */
        public final long m108658getRefreshEK5gGoQ() {
            return Key.Refresh;
        }

        /* renamed from: getRightBracket-EK5gGoQ  reason: not valid java name */
        public final long m108659getRightBracketEK5gGoQ() {
            return Key.RightBracket;
        }

        /* renamed from: getRo-EK5gGoQ  reason: not valid java name */
        public final long m108660getRoEK5gGoQ() {
            return Key.f484Ro;
        }

        /* renamed from: getS-EK5gGoQ  reason: not valid java name */
        public final long m108661getSEK5gGoQ() {
            return Key.f485S;
        }

        /* renamed from: getScrollLock-EK5gGoQ  reason: not valid java name */
        public final long m108662getScrollLockEK5gGoQ() {
            return Key.ScrollLock;
        }

        /* renamed from: getSearch-EK5gGoQ  reason: not valid java name */
        public final long m108663getSearchEK5gGoQ() {
            return Key.Search;
        }

        /* renamed from: getSemicolon-EK5gGoQ  reason: not valid java name */
        public final long m108664getSemicolonEK5gGoQ() {
            return Key.Semicolon;
        }

        /* renamed from: getSetTopBoxInput-EK5gGoQ  reason: not valid java name */
        public final long m108665getSetTopBoxInputEK5gGoQ() {
            return Key.SetTopBoxInput;
        }

        /* renamed from: getSetTopBoxPower-EK5gGoQ  reason: not valid java name */
        public final long m108666getSetTopBoxPowerEK5gGoQ() {
            return Key.SetTopBoxPower;
        }

        /* renamed from: getSettings-EK5gGoQ  reason: not valid java name */
        public final long m108667getSettingsEK5gGoQ() {
            return Key.Settings;
        }

        /* renamed from: getSeven-EK5gGoQ  reason: not valid java name */
        public final long m108668getSevenEK5gGoQ() {
            return Key.Seven;
        }

        /* renamed from: getShiftLeft-EK5gGoQ  reason: not valid java name */
        public final long m108669getShiftLeftEK5gGoQ() {
            return Key.ShiftLeft;
        }

        /* renamed from: getShiftRight-EK5gGoQ  reason: not valid java name */
        public final long m108670getShiftRightEK5gGoQ() {
            return Key.ShiftRight;
        }

        /* renamed from: getSix-EK5gGoQ  reason: not valid java name */
        public final long m108671getSixEK5gGoQ() {
            return Key.Six;
        }

        /* renamed from: getSlash-EK5gGoQ  reason: not valid java name */
        public final long m108672getSlashEK5gGoQ() {
            return Key.Slash;
        }

        /* renamed from: getSleep-EK5gGoQ  reason: not valid java name */
        public final long m108673getSleepEK5gGoQ() {
            return Key.Sleep;
        }

        /* renamed from: getSoftLeft-EK5gGoQ  reason: not valid java name */
        public final long m108674getSoftLeftEK5gGoQ() {
            return Key.SoftLeft;
        }

        /* renamed from: getSoftRight-EK5gGoQ  reason: not valid java name */
        public final long m108675getSoftRightEK5gGoQ() {
            return Key.SoftRight;
        }

        /* renamed from: getSoftSleep-EK5gGoQ  reason: not valid java name */
        public final long m108676getSoftSleepEK5gGoQ() {
            return Key.SoftSleep;
        }

        /* renamed from: getSpacebar-EK5gGoQ  reason: not valid java name */
        public final long m108677getSpacebarEK5gGoQ() {
            return Key.Spacebar;
        }

        /* renamed from: getStem1-EK5gGoQ  reason: not valid java name */
        public final long m108678getStem1EK5gGoQ() {
            return Key.Stem1;
        }

        /* renamed from: getStem2-EK5gGoQ  reason: not valid java name */
        public final long m108679getStem2EK5gGoQ() {
            return Key.Stem2;
        }

        /* renamed from: getStem3-EK5gGoQ  reason: not valid java name */
        public final long m108680getStem3EK5gGoQ() {
            return Key.Stem3;
        }

        /* renamed from: getStemPrimary-EK5gGoQ  reason: not valid java name */
        public final long m108681getStemPrimaryEK5gGoQ() {
            return Key.StemPrimary;
        }

        /* renamed from: getSwitchCharset-EK5gGoQ  reason: not valid java name */
        public final long m108682getSwitchCharsetEK5gGoQ() {
            return Key.SwitchCharset;
        }

        /* renamed from: getSymbol-EK5gGoQ  reason: not valid java name */
        public final long m108683getSymbolEK5gGoQ() {
            return Key.Symbol;
        }

        /* renamed from: getSystemNavigationDown-EK5gGoQ  reason: not valid java name */
        public final long m108684getSystemNavigationDownEK5gGoQ() {
            return Key.SystemNavigationDown;
        }

        /* renamed from: getSystemNavigationLeft-EK5gGoQ  reason: not valid java name */
        public final long m108685getSystemNavigationLeftEK5gGoQ() {
            return Key.SystemNavigationLeft;
        }

        /* renamed from: getSystemNavigationRight-EK5gGoQ  reason: not valid java name */
        public final long m108686getSystemNavigationRightEK5gGoQ() {
            return Key.SystemNavigationRight;
        }

        /* renamed from: getSystemNavigationUp-EK5gGoQ  reason: not valid java name */
        public final long m108687getSystemNavigationUpEK5gGoQ() {
            return Key.SystemNavigationUp;
        }

        /* renamed from: getT-EK5gGoQ  reason: not valid java name */
        public final long m108688getTEK5gGoQ() {
            return Key.f486T;
        }

        /* renamed from: getTab-EK5gGoQ  reason: not valid java name */
        public final long m108689getTabEK5gGoQ() {
            return Key.Tab;
        }

        /* renamed from: getThree-EK5gGoQ  reason: not valid java name */
        public final long m108690getThreeEK5gGoQ() {
            return Key.Three;
        }

        /* renamed from: getThumbsDown-EK5gGoQ  reason: not valid java name */
        public final long m108691getThumbsDownEK5gGoQ() {
            return Key.ThumbsDown;
        }

        /* renamed from: getThumbsUp-EK5gGoQ  reason: not valid java name */
        public final long m108692getThumbsUpEK5gGoQ() {
            return Key.ThumbsUp;
        }

        /* renamed from: getToggle2D3D-EK5gGoQ  reason: not valid java name */
        public final long m108693getToggle2D3DEK5gGoQ() {
            return Key.Toggle2D3D;
        }

        /* renamed from: getTv-EK5gGoQ  reason: not valid java name */
        public final long m108694getTvEK5gGoQ() {
            return Key.f487Tv;
        }

        /* renamed from: getTvAntennaCable-EK5gGoQ  reason: not valid java name */
        public final long m108695getTvAntennaCableEK5gGoQ() {
            return Key.TvAntennaCable;
        }

        /* renamed from: getTvAudioDescription-EK5gGoQ  reason: not valid java name */
        public final long m108696getTvAudioDescriptionEK5gGoQ() {
            return Key.TvAudioDescription;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeDown-EK5gGoQ  reason: not valid java name */
        public final long m108697getTvAudioDescriptionMixingVolumeDownEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeDown;
        }

        /* renamed from: getTvAudioDescriptionMixingVolumeUp-EK5gGoQ  reason: not valid java name */
        public final long m108698getTvAudioDescriptionMixingVolumeUpEK5gGoQ() {
            return Key.TvAudioDescriptionMixingVolumeUp;
        }

        /* renamed from: getTvContentsMenu-EK5gGoQ  reason: not valid java name */
        public final long m108699getTvContentsMenuEK5gGoQ() {
            return Key.TvContentsMenu;
        }

        /* renamed from: getTvDataService-EK5gGoQ  reason: not valid java name */
        public final long m108700getTvDataServiceEK5gGoQ() {
            return Key.TvDataService;
        }

        /* renamed from: getTvInput-EK5gGoQ  reason: not valid java name */
        public final long m108701getTvInputEK5gGoQ() {
            return Key.TvInput;
        }

        /* renamed from: getTvInputComponent1-EK5gGoQ  reason: not valid java name */
        public final long m108702getTvInputComponent1EK5gGoQ() {
            return Key.TvInputComponent1;
        }

        /* renamed from: getTvInputComponent2-EK5gGoQ  reason: not valid java name */
        public final long m108703getTvInputComponent2EK5gGoQ() {
            return Key.TvInputComponent2;
        }

        /* renamed from: getTvInputComposite1-EK5gGoQ  reason: not valid java name */
        public final long m108704getTvInputComposite1EK5gGoQ() {
            return Key.TvInputComposite1;
        }

        /* renamed from: getTvInputComposite2-EK5gGoQ  reason: not valid java name */
        public final long m108705getTvInputComposite2EK5gGoQ() {
            return Key.TvInputComposite2;
        }

        /* renamed from: getTvInputHdmi1-EK5gGoQ  reason: not valid java name */
        public final long m108706getTvInputHdmi1EK5gGoQ() {
            return Key.TvInputHdmi1;
        }

        /* renamed from: getTvInputHdmi2-EK5gGoQ  reason: not valid java name */
        public final long m108707getTvInputHdmi2EK5gGoQ() {
            return Key.TvInputHdmi2;
        }

        /* renamed from: getTvInputHdmi3-EK5gGoQ  reason: not valid java name */
        public final long m108708getTvInputHdmi3EK5gGoQ() {
            return Key.TvInputHdmi3;
        }

        /* renamed from: getTvInputHdmi4-EK5gGoQ  reason: not valid java name */
        public final long m108709getTvInputHdmi4EK5gGoQ() {
            return Key.TvInputHdmi4;
        }

        /* renamed from: getTvInputVga1-EK5gGoQ  reason: not valid java name */
        public final long m108710getTvInputVga1EK5gGoQ() {
            return Key.TvInputVga1;
        }

        /* renamed from: getTvMediaContextMenu-EK5gGoQ  reason: not valid java name */
        public final long m108711getTvMediaContextMenuEK5gGoQ() {
            return Key.TvMediaContextMenu;
        }

        /* renamed from: getTvNetwork-EK5gGoQ  reason: not valid java name */
        public final long m108712getTvNetworkEK5gGoQ() {
            return Key.TvNetwork;
        }

        /* renamed from: getTvNumberEntry-EK5gGoQ  reason: not valid java name */
        public final long m108713getTvNumberEntryEK5gGoQ() {
            return Key.TvNumberEntry;
        }

        /* renamed from: getTvPower-EK5gGoQ  reason: not valid java name */
        public final long m108714getTvPowerEK5gGoQ() {
            return Key.TvPower;
        }

        /* renamed from: getTvRadioService-EK5gGoQ  reason: not valid java name */
        public final long m108715getTvRadioServiceEK5gGoQ() {
            return Key.TvRadioService;
        }

        /* renamed from: getTvSatellite-EK5gGoQ  reason: not valid java name */
        public final long m108716getTvSatelliteEK5gGoQ() {
            return Key.TvSatellite;
        }

        /* renamed from: getTvSatelliteBs-EK5gGoQ  reason: not valid java name */
        public final long m108717getTvSatelliteBsEK5gGoQ() {
            return Key.TvSatelliteBs;
        }

        /* renamed from: getTvSatelliteCs-EK5gGoQ  reason: not valid java name */
        public final long m108718getTvSatelliteCsEK5gGoQ() {
            return Key.TvSatelliteCs;
        }

        /* renamed from: getTvSatelliteService-EK5gGoQ  reason: not valid java name */
        public final long m108719getTvSatelliteServiceEK5gGoQ() {
            return Key.TvSatelliteService;
        }

        /* renamed from: getTvTeletext-EK5gGoQ  reason: not valid java name */
        public final long m108720getTvTeletextEK5gGoQ() {
            return Key.TvTeletext;
        }

        /* renamed from: getTvTerrestrialAnalog-EK5gGoQ  reason: not valid java name */
        public final long m108721getTvTerrestrialAnalogEK5gGoQ() {
            return Key.TvTerrestrialAnalog;
        }

        /* renamed from: getTvTerrestrialDigital-EK5gGoQ  reason: not valid java name */
        public final long m108722getTvTerrestrialDigitalEK5gGoQ() {
            return Key.TvTerrestrialDigital;
        }

        /* renamed from: getTvTimerProgramming-EK5gGoQ  reason: not valid java name */
        public final long m108723getTvTimerProgrammingEK5gGoQ() {
            return Key.TvTimerProgramming;
        }

        /* renamed from: getTvZoomMode-EK5gGoQ  reason: not valid java name */
        public final long m108724getTvZoomModeEK5gGoQ() {
            return Key.TvZoomMode;
        }

        /* renamed from: getTwo-EK5gGoQ  reason: not valid java name */
        public final long m108725getTwoEK5gGoQ() {
            return Key.Two;
        }

        /* renamed from: getU-EK5gGoQ  reason: not valid java name */
        public final long m108726getUEK5gGoQ() {
            return Key.f488U;
        }

        /* renamed from: getUnknown-EK5gGoQ  reason: not valid java name */
        public final long m108727getUnknownEK5gGoQ() {
            return Key.Unknown;
        }

        /* renamed from: getV-EK5gGoQ  reason: not valid java name */
        public final long m108728getVEK5gGoQ() {
            return Key.f489V;
        }

        /* renamed from: getVoiceAssist-EK5gGoQ  reason: not valid java name */
        public final long m108729getVoiceAssistEK5gGoQ() {
            return Key.VoiceAssist;
        }

        /* renamed from: getVolumeDown-EK5gGoQ  reason: not valid java name */
        public final long m108730getVolumeDownEK5gGoQ() {
            return Key.VolumeDown;
        }

        /* renamed from: getVolumeMute-EK5gGoQ  reason: not valid java name */
        public final long m108731getVolumeMuteEK5gGoQ() {
            return Key.VolumeMute;
        }

        /* renamed from: getVolumeUp-EK5gGoQ  reason: not valid java name */
        public final long m108732getVolumeUpEK5gGoQ() {
            return Key.VolumeUp;
        }

        /* renamed from: getW-EK5gGoQ  reason: not valid java name */
        public final long m108733getWEK5gGoQ() {
            return Key.f490W;
        }

        /* renamed from: getWakeUp-EK5gGoQ  reason: not valid java name */
        public final long m108734getWakeUpEK5gGoQ() {
            return Key.WakeUp;
        }

        /* renamed from: getWindow-EK5gGoQ  reason: not valid java name */
        public final long m108735getWindowEK5gGoQ() {
            return Key.Window;
        }

        /* renamed from: getX-EK5gGoQ  reason: not valid java name */
        public final long m108736getXEK5gGoQ() {
            return Key.f491X;
        }

        /* renamed from: getY-EK5gGoQ  reason: not valid java name */
        public final long m108737getYEK5gGoQ() {
            return Key.f492Y;
        }

        /* renamed from: getYen-EK5gGoQ  reason: not valid java name */
        public final long m108738getYenEK5gGoQ() {
            return Key.Yen;
        }

        /* renamed from: getZ-EK5gGoQ  reason: not valid java name */
        public final long m108739getZEK5gGoQ() {
            return Key.f493Z;
        }

        /* renamed from: getZenkakuHankaru-EK5gGoQ  reason: not valid java name */
        public final long m108740getZenkakuHankaruEK5gGoQ() {
            return Key.ZenkakuHankaru;
        }

        /* renamed from: getZero-EK5gGoQ  reason: not valid java name */
        public final long m108741getZeroEK5gGoQ() {
            return Key.Zero;
        }

        /* renamed from: getZoomIn-EK5gGoQ  reason: not valid java name */
        public final long m108742getZoomInEK5gGoQ() {
            return Key.ZoomIn;
        }

        /* renamed from: getZoomOut-EK5gGoQ  reason: not valid java name */
        public final long m108743getZoomOutEK5gGoQ() {
            return Key.ZoomOut;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getA-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108170getAEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAllApps-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108171getAllAppsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAltLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108172getAltLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAltRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108173getAltRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getApostrophe-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108174getApostropheEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAppSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108175getAppSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAssist-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108176getAssistEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAt-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108177getAtEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAvReceiverInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108178getAvReceiverInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getAvReceiverPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108179getAvReceiverPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getB-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108180getBEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBack-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108181getBackEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBackslash-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108182getBackslashEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBackspace-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108183getBackspaceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBookmark-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108184getBookmarkEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBreak-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108185getBreakEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrightnessDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108186getBrightnessDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrightnessUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108187getBrightnessUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getBrowser-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108188getBrowserEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108189getButton1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton10-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108190getButton10EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton11-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108191getButton11EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton12-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108192getButton12EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton13-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108193getButton13EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton14-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108194getButton14EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton15-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108195getButton15EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton16-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108196getButton16EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108197getButton2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108198getButton3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108199getButton4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108200getButton5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108201getButton6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108202getButton7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108203getButton8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButton9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108204getButton9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonA-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108205getButtonAEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonB-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108206getButtonBEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonC-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108207getButtonCEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonL1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108208getButtonL1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonL2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108209getButtonL2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108210getButtonModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonR1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108211getButtonR1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonR2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108212getButtonR2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonSelect-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108213getButtonSelectEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonStart-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108214getButtonStartEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonThumbLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108215getButtonThumbLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonThumbRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108216getButtonThumbRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonX-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108217getButtonXEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonY-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108218getButtonYEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getButtonZ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108219getButtonZEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getC-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108220getCEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCalculator-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108221getCalculatorEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCalendar-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108222getCalendarEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCall-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108223getCallEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCamera-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108224getCameraEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCapsLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108225getCapsLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCaptions-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108226getCaptionsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getChannelDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108227getChannelDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getChannelUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108228getChannelUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getClear-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108229getClearEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getComma-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108230getCommaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getContacts-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108231getContactsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCopy-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108232getCopyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCtrlLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108233getCtrlLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCtrlRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108234getCtrlRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getCut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108235getCutEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getD-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108236getDEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDelete-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108237getDeleteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionCenter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108238getDirectionCenterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108239getDirectionDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDownLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108240getDirectionDownLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionDownRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108241getDirectionDownRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108242getDirectionLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108243getDirectionRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108244getDirectionUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUpLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108245getDirectionUpLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDirectionUpRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108246getDirectionUpRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getDvr-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108247getDvrEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getE-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108248getEEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108249getEightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEisu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108250getEisuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEndCall-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108251getEndCallEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108252getEnterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEnvelope-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108253getEnvelopeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEquals-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108254getEqualsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getEscape-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108255getEscapeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108256getFEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108257getF1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF10-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108258getF10EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF11-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108259getF11EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF12-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108260getF12EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108261getF2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108262getF3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108263getF4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108264getF5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108265getF6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108266getF7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108267getF8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getF9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108268getF9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFive-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108269getFiveEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFocus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108270getFocusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108271getForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFour-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108272getFourEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getFunction-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108273getFunctionEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getG-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108274getGEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getGrave-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108275getGraveEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getGuide-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108276getGuideEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getH-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108277getHEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHeadsetHook-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108278getHeadsetHookEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHelp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108279getHelpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHenkan-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108280getHenkanEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getHome-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108281getHomeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getI-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108282getIEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getInfo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108283getInfoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getInsert-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108284getInsertEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getJ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108285getJEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getK-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108286getKEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getKana-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108287getKanaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getKatakanaHiragana-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108288getKatakanaHiraganaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getL-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108289getLEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLanguageSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108290getLanguageSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLastChannel-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108291getLastChannelEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getLeftBracket-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108292getLeftBracketEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getM-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108293getMEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMannerMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108294getMannerModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaAudioTrack-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108295getMediaAudioTrackEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaClose-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108296getMediaCloseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaEject-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108297getMediaEjectEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaFastForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108298getMediaFastForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaNext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108299getMediaNextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPause-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108300getMediaPauseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPlay-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108301getMediaPlayEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPlayPause-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108302getMediaPlayPauseEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaPrevious-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108303getMediaPreviousEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaRecord-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108304getMediaRecordEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaRewind-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108305getMediaRewindEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaSkipBackward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108306getMediaSkipBackwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaSkipForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108307getMediaSkipForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStepBackward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108308getMediaStepBackwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStepForward-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108309getMediaStepForwardEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaStop-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108310getMediaStopEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMediaTopMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108311getMediaTopMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108312getMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMetaLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108313getMetaLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMetaRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108314getMetaRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMicrophoneMute-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108315getMicrophoneMuteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMinus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108316getMinusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMoveEnd-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108317getMoveEndEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMoveHome-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108318getMoveHomeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMuhenkan-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108319getMuhenkanEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMultiply-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108320getMultiplyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getMusic-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108321getMusicEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getN-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108322getNEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateIn-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108323getNavigateInEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateNext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108324getNavigateNextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigateOut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108325getNavigateOutEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNavigatePrevious-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108326getNavigatePreviousEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNine-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108327getNineEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNotification-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108328getNotificationEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108329getNumLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad0-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108330getNumPad0EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108331getNumPad1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108332getNumPad2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108333getNumPad3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108334getNumPad4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad5-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108335getNumPad5EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad6-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108336getNumPad6EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad7-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108337getNumPad7EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad8-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108338getNumPad8EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPad9-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108339getNumPad9EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadAdd-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108340getNumPadAddEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadComma-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108341getNumPadCommaEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadDivide-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108342getNumPadDivideEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadDot-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108343getNumPadDotEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadEnter-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108344getNumPadEnterEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadEquals-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108345getNumPadEqualsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadLeftParenthesis-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108346getNumPadLeftParenthesisEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadMultiply-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108347getNumPadMultiplyEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadRightParenthesis-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108348getNumPadRightParenthesisEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumPadSubtract-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108349getNumPadSubtractEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getNumber-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108350getNumberEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getO-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108351getOEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getOne-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108352getOneEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getP-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108353getPEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPageDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108354getPageDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPageUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108355getPageUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPairing-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108356getPairingEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPaste-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108357getPasteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPeriod-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108358getPeriodEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPictureSymbols-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108359getPictureSymbolsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPlus-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108360getPlusEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPound-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108361getPoundEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108362getPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getPrintScreen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108363getPrintScreenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProfileSwitch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108364getProfileSwitchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramBlue-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108365getProgramBlueEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramGreen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108366getProgramGreenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramRed-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108367getProgramRedEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getProgramYellow-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108368getProgramYellowEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getQ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108369getQEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getR-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108370getREK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRefresh-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108371getRefreshEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRightBracket-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108372getRightBracketEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108373getRoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getS-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108374getSEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getScrollLock-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108375getScrollLockEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSearch-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108376getSearchEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSemicolon-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108377getSemicolonEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSetTopBoxInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108378getSetTopBoxInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSetTopBoxPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108379getSetTopBoxPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSettings-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108380getSettingsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSeven-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108381getSevenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getShiftLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108382getShiftLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getShiftRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108383getShiftRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSix-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108384getSixEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSlash-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108385getSlashEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSleep-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108386getSleepEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108387getSoftLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108388getSoftRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSoftSleep-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108389getSoftSleepEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSpacebar-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108390getSpacebarEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108391getStem1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108392getStem2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStem3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108393getStem3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getStemPrimary-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108394getStemPrimaryEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSwitchCharset-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108395getSwitchCharsetEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSymbol-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108396getSymbolEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108397getSystemNavigationDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationLeft-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108398getSystemNavigationLeftEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationRight-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108399getSystemNavigationRightEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getSystemNavigationUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108400getSystemNavigationUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getT-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108401getTEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTab-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108402getTabEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThree-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108403getThreeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThumbsDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108404getThumbsDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getThumbsUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108405getThumbsUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getToggle2D3D-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108406getToggle2D3DEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTv-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108407getTvEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAntennaCable-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108408getTvAntennaCableEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescription-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108409getTvAudioDescriptionEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescriptionMixingVolumeDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108410getTvAudioDescriptionMixingVolumeDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvAudioDescriptionMixingVolumeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108411getTvAudioDescriptionMixingVolumeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvContentsMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108412getTvContentsMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvDataService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108413getTvDataServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInput-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108414getTvInputEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComponent1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108415getTvInputComponent1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComponent2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108416getTvInputComponent2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComposite1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108417getTvInputComposite1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputComposite2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108418getTvInputComposite2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108419getTvInputHdmi1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi2-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108420getTvInputHdmi2EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi3-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108421getTvInputHdmi3EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputHdmi4-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108422getTvInputHdmi4EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvInputVga1-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108423getTvInputVga1EK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvMediaContextMenu-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108424getTvMediaContextMenuEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvNetwork-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108425getTvNetworkEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvNumberEntry-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108426getTvNumberEntryEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvPower-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108427getTvPowerEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvRadioService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108428getTvRadioServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatellite-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108429getTvSatelliteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteBs-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108430getTvSatelliteBsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteCs-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108431getTvSatelliteCsEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvSatelliteService-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108432getTvSatelliteServiceEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTeletext-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108433getTvTeletextEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTerrestrialAnalog-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108434getTvTerrestrialAnalogEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTerrestrialDigital-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108435getTvTerrestrialDigitalEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvTimerProgramming-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108436getTvTimerProgrammingEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTvZoomMode-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108437getTvZoomModeEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getTwo-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108438getTwoEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getU-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108439getUEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getUnknown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108440getUnknownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getV-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108441getVEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVoiceAssist-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108442getVoiceAssistEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeDown-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108443getVolumeDownEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeMute-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108444getVolumeMuteEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getVolumeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108445getVolumeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getW-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108446getWEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getWakeUp-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108447getWakeUpEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getWindow-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108448getWindowEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getX-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108449getXEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getY-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108450getYEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getYen-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108451getYenEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZ-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108452getZEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZenkakuHankaru-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108453getZenkakuHankaruEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZero-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108454getZeroEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZoomIn-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108455getZoomInEK5gGoQ$annotations() {
        }

        @ExperimentalComposeUiApi
        /* renamed from: getZoomOut-EK5gGoQ$annotations  reason: not valid java name */
        public static /* synthetic */ void m108456getZoomOutEK5gGoQ$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m108164constructorimpl(long j) {
        return j;
    }
}
