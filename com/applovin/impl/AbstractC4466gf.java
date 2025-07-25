package com.applovin.impl;

import com.applovin.impl.C4061af;
import com.applovin.impl.C4310e9;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: com.applovin.impl.gf */
/* loaded from: classes2.dex */
abstract class AbstractC4466gf {

    /* renamed from: a */
    static final String[] f6403a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static C5597u3 m98951a(int i, C4066ah c4066ah) {
        int m100775j = c4066ah.m100775j();
        if (c4066ah.m100775j() == 1684108385) {
            c4066ah.m100778g(8);
            String m100788b = c4066ah.m100788b(m100775j - 16);
            return new C5597u3("und", m100788b, m100788b);
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse comment attribute: " + AbstractC4620j1.m98353a(i));
        return null;
    }

    /* renamed from: b */
    public static C4061af.InterfaceC4063b m98943b(C4066ah c4066ah) {
        int m100785d = c4066ah.m100785d() + c4066ah.m100775j();
        int m100775j = c4066ah.m100775j();
        int i = (m100775j >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & m100775j;
                if (i2 == 6516084) {
                    return m98951a(m100775j, c4066ah);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return m98944b(m100775j, "TIT2", c4066ah);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return m98944b(m100775j, "TCOM", c4066ah);
                }
                if (i2 == 6578553) {
                    return m98944b(m100775j, "TDRC", c4066ah);
                }
                if (i2 == 4280916) {
                    return m98944b(m100775j, "TPE1", c4066ah);
                }
                if (i2 == 7630703) {
                    return m98944b(m100775j, "TSSE", c4066ah);
                }
                if (i2 == 6384738) {
                    return m98944b(m100775j, "TALB", c4066ah);
                }
                if (i2 == 7108978) {
                    return m98944b(m100775j, "USLT", c4066ah);
                }
                if (i2 == 6776174) {
                    return m98944b(m100775j, "TCON", c4066ah);
                }
                if (i2 == 6779504) {
                    return m98944b(m100775j, "TIT1", c4066ah);
                }
            } else if (m100775j == 1735291493) {
                return m98942c(c4066ah);
            } else {
                if (m100775j == 1684632427) {
                    return m98949a(m100775j, "TPOS", c4066ah);
                }
                if (m100775j == 1953655662) {
                    return m98949a(m100775j, "TRCK", c4066ah);
                }
                if (m100775j == 1953329263) {
                    return m98948a(m100775j, "TBPM", c4066ah, true, false);
                }
                if (m100775j == 1668311404) {
                    return m98948a(m100775j, "TCMP", c4066ah, true, true);
                }
                if (m100775j == 1668249202) {
                    return m98947a(c4066ah);
                }
                if (m100775j == 1631670868) {
                    return m98944b(m100775j, "TPE2", c4066ah);
                }
                if (m100775j == 1936682605) {
                    return m98944b(m100775j, "TSOT", c4066ah);
                }
                if (m100775j == 1936679276) {
                    return m98944b(m100775j, "TSO2", c4066ah);
                }
                if (m100775j == 1936679282) {
                    return m98944b(m100775j, "TSOA", c4066ah);
                }
                if (m100775j == 1936679265) {
                    return m98944b(m100775j, "TSOP", c4066ah);
                }
                if (m100775j == 1936679791) {
                    return m98944b(m100775j, "TSOC", c4066ah);
                }
                if (m100775j == 1920233063) {
                    return m98948a(m100775j, "ITUNESADVISORY", c4066ah, false, false);
                }
                if (m100775j == 1885823344) {
                    return m98948a(m100775j, "ITUNESGAPLESS", c4066ah, false, true);
                }
                if (m100775j == 1936683886) {
                    return m98944b(m100775j, "TVSHOWSORT", c4066ah);
                }
                if (m100775j == 1953919848) {
                    return m98944b(m100775j, "TVSHOW", c4066ah);
                }
                if (m100775j == 757935405) {
                    return m98946a(c4066ah, m100785d);
                }
            }
            AbstractC5063oc.m96809a("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC4620j1.m98353a(m100775j));
            c4066ah.m100780f(m100785d);
            return null;
        } finally {
            c4066ah.m100780f(m100785d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.C5986zn m98942c(com.applovin.impl.C4066ah r3) {
        /*
            int r3 = m98941d(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = com.applovin.impl.AbstractC4466gf.f6403a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.applovin.impl.zn r1 = new com.applovin.impl.zn
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            com.applovin.impl.AbstractC5063oc.m96800d(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4466gf.m98942c(com.applovin.impl.ah):com.applovin.impl.zn");
    }

    /* renamed from: d */
    private static int m98941d(C4066ah c4066ah) {
        c4066ah.m100778g(4);
        if (c4066ah.m100775j() == 1684108385) {
            c4066ah.m100778g(8);
            return c4066ah.m100762w();
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    private static C5669v0 m98947a(C4066ah c4066ah) {
        int m100775j = c4066ah.m100775j();
        if (c4066ah.m100775j() == 1684108385) {
            int m98352b = AbstractC4620j1.m98352b(c4066ah.m100775j());
            String str = m98352b == 13 ? "image/jpeg" : m98352b == 14 ? "image/png" : null;
            if (str == null) {
                AbstractC5063oc.m96800d("MetadataUtil", "Unrecognized cover art flags: " + m98352b);
                return null;
            }
            c4066ah.m100778g(4);
            int i = m100775j - 16;
            byte[] bArr = new byte[i];
            c4066ah.m100790a(bArr, 0, i);
            return new C5669v0(str, null, 3, bArr);
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: a */
    private static C5986zn m98949a(int i, String str, C4066ah c4066ah) {
        int m100775j = c4066ah.m100775j();
        if (c4066ah.m100775j() == 1684108385 && m100775j >= 22) {
            c4066ah.m100778g(10);
            int m100799C = c4066ah.m100799C();
            if (m100799C > 0) {
                String str2 = "" + m100799C;
                int m100799C2 = c4066ah.m100799C();
                if (m100799C2 > 0) {
                    str2 = str2 + RemoteSettings.FORWARD_SLASH_STRING + m100799C2;
                }
                return new C5986zn(str, null, str2);
            }
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC4620j1.m98353a(i));
        return null;
    }

    /* renamed from: a */
    private static AbstractC5837xa m98946a(C4066ah c4066ah, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (c4066ah.m100785d() < i) {
            int m100785d = c4066ah.m100785d();
            int m100775j = c4066ah.m100775j();
            int m100775j2 = c4066ah.m100775j();
            c4066ah.m100778g(4);
            if (m100775j2 == 1835360622) {
                str = c4066ah.m100788b(m100775j - 12);
            } else if (m100775j2 == 1851878757) {
                str2 = c4066ah.m100788b(m100775j - 12);
            } else {
                if (m100775j2 == 1684108385) {
                    i2 = m100785d;
                    i3 = m100775j;
                }
                c4066ah.m100778g(m100775j - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        c4066ah.m100780f(i2);
        c4066ah.m100778g(16);
        return new C5259rb(str, str2, c4066ah.m100788b(i3 - 16));
    }

    /* renamed from: a */
    public static C4318ed m98945a(C4066ah c4066ah, int i, String str) {
        while (true) {
            int m100785d = c4066ah.m100785d();
            if (m100785d >= i) {
                return null;
            }
            int m100775j = c4066ah.m100775j();
            if (c4066ah.m100775j() == 1684108385) {
                int m100775j2 = c4066ah.m100775j();
                int m100775j3 = c4066ah.m100775j();
                int i2 = m100775j - 16;
                byte[] bArr = new byte[i2];
                c4066ah.m100790a(bArr, 0, i2);
                return new C4318ed(str, bArr, m100775j3, m100775j2);
            }
            c4066ah.m100780f(m100785d + m100775j);
        }
    }

    /* renamed from: a */
    private static AbstractC5837xa m98948a(int i, String str, C4066ah c4066ah, boolean z, boolean z2) {
        int m98941d = m98941d(c4066ah);
        if (z2) {
            m98941d = Math.min(1, m98941d);
        }
        if (m98941d >= 0) {
            if (z) {
                return new C5986zn(str, null, Integer.toString(m98941d));
            }
            return new C5597u3("und", str, Integer.toString(m98941d));
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC4620j1.m98353a(i));
        return null;
    }

    /* renamed from: a */
    public static void m98950a(int i, C5905y9 c5905y9, C4310e9.C4312b c4312b) {
        if (i == 1 && c5905y9.m92785a()) {
            c4312b.m99611e(c5905y9.f12304a).m99608f(c5905y9.f12305b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m98952a(int r5, com.applovin.impl.C4061af r6, com.applovin.impl.C4061af r7, com.applovin.impl.C4310e9.C4312b r8, com.applovin.impl.C4061af... r9) {
        /*
            com.applovin.impl.af r0 = new com.applovin.impl.af
            r1 = 0
            com.applovin.impl.af$b[] r2 = new com.applovin.impl.C4061af.InterfaceC4063b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.m100807c()
            if (r5 >= r6) goto L3c
            com.applovin.impl.af$b r6 = r7.m100810a(r5)
            boolean r3 = r6 instanceof com.applovin.impl.C4318ed
            if (r3 == 0) goto L39
            com.applovin.impl.ed r6 = (com.applovin.impl.C4318ed) r6
            java.lang.String r3 = r6.f5881a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.applovin.impl.af r5 = new com.applovin.impl.af
            com.applovin.impl.af$b[] r7 = new com.applovin.impl.C4061af.InterfaceC4063b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.applovin.impl.af r6 = r6.m100809a(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.m100807c()
            if (r5 <= 0) goto L52
            r8.m99628a(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4466gf.m98952a(int, com.applovin.impl.af, com.applovin.impl.af, com.applovin.impl.e9$b, com.applovin.impl.af[]):void");
    }

    /* renamed from: b */
    private static C5986zn m98944b(int i, String str, C4066ah c4066ah) {
        int m100775j = c4066ah.m100775j();
        if (c4066ah.m100775j() == 1684108385) {
            c4066ah.m100778g(8);
            return new C5986zn(str, null, c4066ah.m100788b(m100775j - 16));
        }
        AbstractC5063oc.m96800d("MetadataUtil", "Failed to parse text attribute: " + AbstractC4620j1.m98353a(i));
        return null;
    }
}
