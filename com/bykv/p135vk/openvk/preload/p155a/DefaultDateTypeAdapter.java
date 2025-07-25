package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import com.bykv.p135vk.openvk.preload.p155a.p157b.JavaVersion;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.p159a.ISO8601Utils;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonToken;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bykv.vk.openvk.preload.a.a */
/* loaded from: classes3.dex */
final class DefaultDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f13593a;

    /* renamed from: b */
    private final List<DateFormat> f13594b;

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f13594b = arrayList;
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
        this.f13593a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.m91586b()) {
            arrayList.add(WebResourceUtils.m91438a(i, i2));
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
    /* renamed from: a */
    public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            jsonWriter.m91499h();
            return;
        }
        synchronized (this.f13594b) {
            jsonWriter.m91509b(this.f13594b.get(0).format(date2));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f13594b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* renamed from: a */
    private Date m91670a(String str) {
        synchronized (this.f13594b) {
            for (DateFormat dateFormat : this.f13594b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return ISO8601Utils.m91644a(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
    /* renamed from: a */
    public final /* synthetic */ Date mo91327a(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo91542f() == JsonToken.NULL) {
            jsonReader.mo91538j();
            return null;
        }
        Date m91670a = m91670a(jsonReader.mo91540h());
        Class<? extends Date> cls = this.f13593a;
        if (cls == Date.class) {
            return m91670a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(m91670a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(m91670a.getTime());
        }
        throw new AssertionError();
    }
}
