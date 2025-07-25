package com.mbridge.msdk.dycreator.p422e;

import com.mbridge.msdk.dycreator.p417a.SystemParamValue;

/* renamed from: com.mbridge.msdk.dycreator.e.a */
/* loaded from: classes6.dex */
public final class AttributeUtil {

    /* compiled from: AttributeUtil.java */
    /* renamed from: com.mbridge.msdk.dycreator.e.a$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55959a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55959a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55959a[SystemParamValue.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55959a[SystemParamValue.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55959a[SystemParamValue.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55959a[SystemParamValue.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55959a[SystemParamValue.paddingTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55959a[SystemParamValue.paddingBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55959a[SystemParamValue.paddingLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55959a[SystemParamValue.paddingRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55959a[SystemParamValue.paddingStart.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55959a[SystemParamValue.paddingEnd.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55959a[SystemParamValue.orientation.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55959a[SystemParamValue.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55959a[SystemParamValue.ellipsize.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55959a[SystemParamValue.fadingEdge.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55959a[SystemParamValue.scrollHorizontally.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55959a[SystemParamValue.textColor.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f55959a[SystemParamValue.textSize.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f55959a[SystemParamValue.textStyle.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f55959a[SystemParamValue.style.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f55959a[SystemParamValue.tag.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f55959a[SystemParamValue.gravity.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f55959a[SystemParamValue.verticalSpacing.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f55959a[SystemParamValue.numColumns.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f55959a[SystemParamValue.splitMotionEvents.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f55959a[SystemParamValue.cacheColorHint.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f55959a[SystemParamValue.horizontalSpacing.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f55959a[SystemParamValue.singleLine.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f55959a[SystemParamValue.lines.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f55959a[SystemParamValue.drawableLeft.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f55959a[SystemParamValue.drawablePadding.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f55959a[SystemParamValue.src.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f55959a[SystemParamValue.scaleType.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f55959a[SystemParamValue.divider.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f55959a[SystemParamValue.scrollbars.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f55959a[SystemParamValue.listSelector.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0143, code lost:
        if (r4.length <= 2) goto L312;
     */
    /* JADX WARN: Removed duplicated region for block: B:465:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x01fd A[Catch: Exception -> 0x06f1, TRY_LEAVE, TryCatch #11 {Exception -> 0x06f1, blocks: (B:369:0x000c, B:371:0x0016, B:374:0x001e, B:376:0x0029, B:379:0x003d, B:383:0x0051, B:384:0x0061, B:385:0x0071, B:386:0x0081, B:387:0x0091, B:388:0x00a1, B:391:0x00b6, B:392:0x00c6, B:463:0x01f4, B:467:0x01fd, B:470:0x020a, B:496:0x02f6, B:497:0x02ff, B:499:0x0303, B:553:0x0482, B:554:0x048b, B:556:0x048f, B:579:0x04f8, B:580:0x0501, B:583:0x0507, B:610:0x0590, B:611:0x0599, B:613:0x059d, B:628:0x062d, B:629:0x0636, B:631:0x063a, B:632:0x063f, B:635:0x0647, B:645:0x066c, B:646:0x0675, B:648:0x0679, B:649:0x067e, B:651:0x0682, B:665:0x06a9, B:666:0x06b1, B:668:0x06b6, B:675:0x06d7, B:676:0x06df, B:678:0x06e3, B:405:0x00ef, B:406:0x00f7, B:417:0x011f, B:418:0x0127, B:448:0x01b2, B:449:0x01ba, B:462:0x01ed, B:584:0x050a, B:588:0x051a, B:590:0x051f, B:592:0x0529, B:593:0x0536, B:595:0x0540, B:597:0x0548, B:598:0x054c, B:600:0x0552, B:601:0x0558, B:603:0x0562, B:605:0x056a, B:606:0x0570, B:607:0x0581, B:450:0x01c2, B:452:0x01c8, B:457:0x01de, B:459:0x01e4, B:453:0x01ce, B:455:0x01d6, B:614:0x05a0, B:616:0x05aa, B:618:0x05af, B:619:0x05cd, B:620:0x05de, B:621:0x05ec, B:622:0x05f6, B:623:0x0614, B:625:0x061e, B:636:0x064a, B:639:0x0656, B:641:0x0660, B:642:0x0666, B:557:0x0492, B:562:0x04a4, B:564:0x04ae, B:566:0x04b6, B:567:0x04bd, B:569:0x04c5, B:570:0x04cc, B:572:0x04d4, B:573:0x04db, B:575:0x04e3, B:576:0x04ea, B:669:0x06b9, B:672:0x06c6, B:471:0x020d, B:472:0x0215, B:474:0x0219, B:475:0x021d, B:477:0x0227, B:479:0x023b, B:480:0x023f, B:481:0x026f, B:483:0x0279, B:484:0x0282, B:486:0x028c, B:487:0x029a, B:488:0x02ab, B:489:0x02b5, B:490:0x02bf, B:492:0x02c6, B:493:0x02e4, B:407:0x00fd, B:409:0x0103, B:411:0x010b, B:412:0x0110, B:414:0x0118, B:500:0x0306, B:501:0x030e, B:502:0x0311, B:504:0x0316, B:505:0x0327, B:507:0x0331, B:508:0x0337, B:510:0x033f, B:511:0x0359, B:512:0x0362, B:513:0x036c, B:514:0x037d, B:517:0x0389, B:520:0x039f, B:521:0x03a4, B:522:0x03c9, B:524:0x03d3, B:525:0x03dc, B:527:0x03e6, B:528:0x03f4, B:529:0x0405, B:530:0x040f, B:531:0x0419, B:533:0x0423, B:535:0x042b, B:536:0x0430, B:538:0x0438, B:539:0x043d, B:541:0x0445, B:542:0x044a, B:544:0x0452, B:545:0x0459, B:547:0x0463, B:549:0x046b, B:550:0x047c), top: B:707:0x000c, inners: #1, #3, #4, #6, #8, #9, #10, #12, #16 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m52953a(android.view.View r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.p422e.AttributeUtil.m52953a(android.view.View, android.util.AttributeSet):void");
    }
}
