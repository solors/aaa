package com.google.zxing.client.result;

import com.p552ot.pubsub.util.C26601v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class CalendarParsedResult extends ParsedResult {

    /* renamed from: m */
    private static final Pattern f44245m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: n */
    private static final long[] f44246n = {C26601v.f69834a, 86400000, 3600000, 60000, 1000};

    /* renamed from: o */
    private static final Pattern f44247o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: b */
    private final String f44248b;

    /* renamed from: c */
    private final long f44249c;

    /* renamed from: d */
    private final boolean f44250d;

    /* renamed from: e */
    private final long f44251e;

    /* renamed from: f */
    private final boolean f44252f;

    /* renamed from: g */
    private final String f44253g;

    /* renamed from: h */
    private final String f44254h;

    /* renamed from: i */
    private final String[] f44255i;

    /* renamed from: j */
    private final String f44256j;

    /* renamed from: k */
    private final double f44257k;

    /* renamed from: l */
    private final double f44258l;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        boolean z;
        long j;
        this.f44248b = str;
        try {
            long m66071b = m66071b(str2);
            this.f44249c = m66071b;
            if (str3 == null) {
                long m66069d = m66069d(str4);
                if (m66069d < 0) {
                    j = -1;
                } else {
                    j = m66071b + m66069d;
                }
                this.f44251e = j;
            } else {
                try {
                    this.f44251e = m66071b(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            boolean z2 = true;
            if (str2.length() == 8) {
                z = true;
            } else {
                z = false;
            }
            this.f44250d = z;
            this.f44252f = (str3 == null || str3.length() != 8) ? false : z2;
            this.f44253g = str5;
            this.f44254h = str6;
            this.f44255i = strArr;
            this.f44256j = str7;
            this.f44257k = d;
            this.f44258l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: a */
    private static String m66072a(boolean z, long j) {
        DateFormat dateTimeInstance;
        if (j < 0) {
            return null;
        }
        if (z) {
            dateTimeInstance = DateFormat.getDateInstance(2);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateTimeInstance.format(Long.valueOf(j));
    }

    /* renamed from: b */
    private static long m66071b(String str) throws ParseException {
        if (f44247o.matcher(str).matches()) {
            if (str.length() == 8) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C26601v.f69840g, Locale.ENGLISH);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat.parse(str).getTime();
            } else if (str.length() == 16 && str.charAt(15) == 'Z') {
                long m66070c = m66070c(str.substring(0, 15));
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                long j = m66070c + gregorianCalendar.get(15);
                gregorianCalendar.setTime(new Date(j));
                return j + gregorianCalendar.get(16);
            } else {
                return m66070c(str);
            }
        }
        throw new ParseException(str, 0);
    }

    /* renamed from: c */
    private static long m66070c(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    /* renamed from: d */
    private static long m66069d(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = f44245m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f44246n;
            if (i < jArr.length) {
                int i2 = i + 1;
                String group = matcher.group(i2);
                if (group != null) {
                    j += jArr[i] * Integer.parseInt(group);
                }
                i = i2;
            } else {
                return j;
            }
        }
    }

    public String[] getAttendees() {
        return this.f44255i;
    }

    public String getDescription() {
        return this.f44256j;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f44248b, sb2);
        ParsedResult.maybeAppend(m66072a(this.f44250d, this.f44249c), sb2);
        ParsedResult.maybeAppend(m66072a(this.f44252f, this.f44251e), sb2);
        ParsedResult.maybeAppend(this.f44253g, sb2);
        ParsedResult.maybeAppend(this.f44254h, sb2);
        ParsedResult.maybeAppend(this.f44255i, sb2);
        ParsedResult.maybeAppend(this.f44256j, sb2);
        return sb2.toString();
    }

    @Deprecated
    public Date getEnd() {
        if (this.f44251e < 0) {
            return null;
        }
        return new Date(this.f44251e);
    }

    public long getEndTimestamp() {
        return this.f44251e;
    }

    public double getLatitude() {
        return this.f44257k;
    }

    public String getLocation() {
        return this.f44253g;
    }

    public double getLongitude() {
        return this.f44258l;
    }

    public String getOrganizer() {
        return this.f44254h;
    }

    @Deprecated
    public Date getStart() {
        return new Date(this.f44249c);
    }

    public long getStartTimestamp() {
        return this.f44249c;
    }

    public String getSummary() {
        return this.f44248b;
    }

    public boolean isEndAllDay() {
        return this.f44252f;
    }

    public boolean isStartAllDay() {
        return this.f44250d;
    }
}
