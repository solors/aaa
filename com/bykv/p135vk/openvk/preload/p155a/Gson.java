package com.bykv.p135vk.openvk.preload.p155a;

import com.bykv.p135vk.openvk.preload.falconx.p166a.WebResourceUtils;
import com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CleanListener;
import com.bykv.p135vk.openvk.preload.p155a.p157b.ConstructorConstructor;
import com.bykv.p135vk.openvk.preload.p155a.p157b.Excluder;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.ArrayTypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.CollectionTypeAdapterFactory;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.DateTypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.JsonAdapterAnnotationTypeAdapterFactory;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.MapTypeAdapterFactory;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.ObjectTypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.ReflectiveTypeAdapterFactory;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.SqlDateTypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.TimeTypeAdapter;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.TypeAdapters;
import com.bykv.p135vk.openvk.preload.p155a.p161c.TypeToken;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonToken;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter;
import com.bykv.p135vk.openvk.preload.p155a.p162d.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.bykv.vk.openvk.preload.a.d */
/* loaded from: classes3.dex */
public final class Gson {

    /* renamed from: a */
    private static final TypeToken<?> f13810a = TypeToken.m91568a(Object.class);

    /* renamed from: b */
    private final ThreadLocal<Map<TypeToken<?>, C6613a<?>>> f13811b;

    /* renamed from: c */
    private final Map<TypeToken<?>, TypeAdapter<?>> f13812c;

    /* renamed from: d */
    private final ConstructorConstructor f13813d;

    /* renamed from: e */
    private final JsonAdapterAnnotationTypeAdapterFactory f13814e;

    /* renamed from: f */
    private List<TypeAdapterFactory> f13815f;

    /* renamed from: g */
    private Excluder f13816g;

    /* renamed from: h */
    private FieldNamingStrategy f13817h;

    /* renamed from: i */
    private Map<Type, CleanListener<?>> f13818i;

    /* renamed from: j */
    private boolean f13819j;

    /* renamed from: k */
    private boolean f13820k;

    /* renamed from: l */
    private boolean f13821l;

    /* renamed from: m */
    private boolean f13822m;

    /* renamed from: n */
    private boolean f13823n;

    /* renamed from: o */
    private boolean f13824o;

    /* renamed from: p */
    private boolean f13825p;

    /* renamed from: q */
    private String f13826q;

    /* renamed from: r */
    private int f13827r;

    /* renamed from: s */
    private int f13828s;

    /* renamed from: t */
    private LongSerializationPolicy f13829t;

    /* renamed from: u */
    private List<TypeAdapterFactory> f13830u;

    /* renamed from: v */
    private List<TypeAdapterFactory> f13831v;

    public Gson() {
        this(Excluder.f13762a, FieldNamingPolicy.f13595a, Collections.emptyMap(), true, LongSerializationPolicy.f13892a, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    static void m91565a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f13815f + ",instanceCreators:" + this.f13813d + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.d$a */
    /* loaded from: classes3.dex */
    public static class C6613a<T> extends TypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter<T> f13836a;

        C6613a() {
        }

        /* renamed from: a */
        public final void m91554a(TypeAdapter<T> typeAdapter) {
            if (this.f13836a == null) {
                this.f13836a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
        /* renamed from: a */
        public final T mo91327a(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.f13836a;
            if (typeAdapter != null) {
                return typeAdapter.mo91327a(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
        /* renamed from: a */
        public final void mo91326a(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.f13836a;
            if (typeAdapter != null) {
                typeAdapter.mo91326a(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final <T> TypeAdapter<T> m91564a(TypeToken<T> typeToken) {
        boolean z;
        TypeAdapter<T> typeAdapter = (TypeAdapter<T>) this.f13812c.get(typeToken == null ? f13810a : typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, C6613a<?>> map = this.f13811b.get();
        if (map == null) {
            map = new HashMap<>();
            this.f13811b.set(map);
            z = true;
        } else {
            z = false;
        }
        C6613a<?> c6613a = map.get(typeToken);
        if (c6613a != null) {
            return c6613a;
        }
        try {
            C6613a<?> c6613a2 = new C6613a<>();
            map.put(typeToken, c6613a2);
            for (TypeAdapterFactory typeAdapterFactory : this.f13815f) {
                TypeAdapter typeAdapter2 = (TypeAdapter<T>) typeAdapterFactory.mo91476a(this, typeToken);
                if (typeAdapter2 != null) {
                    c6613a2.m91554a(typeAdapter2);
                    this.f13812c.put(typeToken, typeAdapter2);
                    return typeAdapter2;
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(typeToken)));
        } finally {
            map.remove(typeToken);
            if (z) {
                this.f13811b.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, CleanListener<?>> map, boolean z, LongSerializationPolicy longSerializationPolicy, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        final TypeAdapter<Number> typeAdapter;
        this.f13811b = new ThreadLocal<>();
        this.f13812c = new ConcurrentHashMap();
        this.f13816g = excluder;
        this.f13817h = fieldNamingStrategy;
        this.f13818i = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map);
        this.f13813d = constructorConstructor;
        this.f13819j = false;
        this.f13820k = false;
        this.f13821l = false;
        this.f13822m = z;
        this.f13823n = false;
        this.f13824o = false;
        this.f13825p = false;
        this.f13829t = longSerializationPolicy;
        this.f13826q = null;
        this.f13827r = i;
        this.f13828s = i2;
        this.f13830u = list;
        this.f13831v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f13665B);
        arrayList.add(ObjectTypeAdapter.f13629a);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f13703p);
        arrayList.add(TypeAdapters.f13694g);
        arrayList.add(TypeAdapters.f13691d);
        arrayList.add(TypeAdapters.f13692e);
        arrayList.add(TypeAdapters.f13693f);
        if (longSerializationPolicy == LongSerializationPolicy.f13892a) {
            typeAdapter = TypeAdapters.f13698k;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.3
                @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
                /* renamed from: a */
                public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        jsonWriter.m91499h();
                    } else {
                        jsonWriter.m91509b(number2.toString());
                    }
                }

                @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
                /* renamed from: a */
                public final /* synthetic */ Number mo91327a(JsonReader jsonReader) throws IOException {
                    if (jsonReader.mo91542f() == JsonToken.NULL) {
                        jsonReader.mo91538j();
                        return null;
                    }
                    return Long.valueOf(jsonReader.mo91536l());
                }
            };
        }
        arrayList.add(TypeAdapters.m91621a(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.m91621a(Double.TYPE, Double.class, new TypeAdapter<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.1
            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.m91499h();
                    return;
                }
                Gson.m91565a(number2.doubleValue());
                jsonWriter.m91514a(number2);
            }

            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ Number mo91327a(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo91542f() == JsonToken.NULL) {
                    jsonReader.mo91538j();
                    return null;
                }
                return Double.valueOf(jsonReader.mo91537k());
            }
        }));
        arrayList.add(TypeAdapters.m91621a(Float.TYPE, Float.class, new TypeAdapter<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.2
            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.m91499h();
                    return;
                }
                Gson.m91565a(number2.floatValue());
                jsonWriter.m91514a(number2);
            }

            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ Number mo91327a(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo91542f() == JsonToken.NULL) {
                    jsonReader.mo91538j();
                    return null;
                }
                return Float.valueOf((float) jsonReader.mo91537k());
            }
        }));
        arrayList.add(TypeAdapters.f13699l);
        arrayList.add(TypeAdapters.f13695h);
        arrayList.add(TypeAdapters.f13696i);
        arrayList.add(TypeAdapters.m91622a(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.d.4
            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.mo91326a(jsonWriter, Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ AtomicLong mo91327a(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.mo91327a(jsonReader)).longValue());
            }
        }.m91477a()));
        arrayList.add(TypeAdapters.m91622a(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.d.5
            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ void mo91326a(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                jsonWriter.m91504d();
                int length = atomicLongArray2.length();
                for (int i3 = 0; i3 < length; i3++) {
                    TypeAdapter.this.mo91326a(jsonWriter, Long.valueOf(atomicLongArray2.get(i3)));
                }
                jsonWriter.m91502e();
            }

            @Override // com.bykv.p135vk.openvk.preload.p155a.TypeAdapter
            /* renamed from: a */
            public final /* synthetic */ AtomicLongArray mo91327a(JsonReader jsonReader) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                jsonReader.mo91557a();
                while (jsonReader.mo91543e()) {
                    arrayList2.add(Long.valueOf(((Number) TypeAdapter.this.mo91327a(jsonReader)).longValue()));
                }
                jsonReader.mo91551b();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList2.get(i3)).longValue());
                }
                return atomicLongArray;
            }
        }.m91477a()));
        arrayList.add(TypeAdapters.f13697j);
        arrayList.add(TypeAdapters.f13700m);
        arrayList.add(TypeAdapters.f13704q);
        arrayList.add(TypeAdapters.f13705r);
        arrayList.add(TypeAdapters.m91622a(BigDecimal.class, TypeAdapters.f13701n));
        arrayList.add(TypeAdapters.m91622a(BigInteger.class, TypeAdapters.f13702o));
        arrayList.add(TypeAdapters.f13706s);
        arrayList.add(TypeAdapters.f13707t);
        arrayList.add(TypeAdapters.f13709v);
        arrayList.add(TypeAdapters.f13710w);
        arrayList.add(TypeAdapters.f13713z);
        arrayList.add(TypeAdapters.f13708u);
        arrayList.add(TypeAdapters.f13689b);
        arrayList.add(DateTypeAdapter.f13615a);
        arrayList.add(TypeAdapters.f13712y);
        arrayList.add(TimeTypeAdapter.f13651a);
        arrayList.add(SqlDateTypeAdapter.f13649a);
        arrayList.add(TypeAdapters.f13711x);
        arrayList.add(ArrayTypeAdapter.f13608a);
        arrayList.add(TypeAdapters.f13688a);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f13814e = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f13666C);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f13815f = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final <T> TypeAdapter<T> m91562a(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        if (!this.f13815f.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f13814e;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f13815f) {
            if (z) {
                TypeAdapter<T> mo91476a = typeAdapterFactory2.mo91476a(this, typeToken);
                if (mo91476a != null) {
                    return mo91476a;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(typeToken)));
    }

    /* renamed from: a */
    public final <T> TypeAdapter<T> m91559a(Class<T> cls) {
        return m91564a((TypeToken) TypeToken.m91568a((Class) cls));
    }

    /* renamed from: a */
    public final String m91558a(Object obj) {
        if (obj == null) {
            JsonNull jsonNull = JsonNull.f13889a;
            StringWriter stringWriter = new StringWriter();
            try {
                JsonWriter m91560a = m91560a((Writer) stringWriter);
                boolean m91520a = m91560a.m91520a();
                m91560a.m91512a(true);
                boolean m91511b = m91560a.m91511b();
                m91560a.m91508b(this.f13822m);
                boolean m91507c = m91560a.m91507c();
                m91560a.m91505c(false);
                try {
                    WebResourceUtils.m91436a(jsonNull, m91560a);
                    m91560a.m91512a(m91520a);
                    m91560a.m91508b(m91511b);
                    m91560a.m91505c(m91507c);
                    return stringWriter.toString();
                } catch (IOException e) {
                    throw new JsonIOException(e);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            JsonWriter m91560a2 = m91560a((Writer) stringWriter2);
            TypeAdapter m91564a = m91564a((TypeToken) TypeToken.m91567a((Type) cls));
            boolean m91520a2 = m91560a2.m91520a();
            m91560a2.m91512a(true);
            boolean m91511b2 = m91560a2.m91511b();
            m91560a2.m91508b(this.f13822m);
            boolean m91507c2 = m91560a2.m91507c();
            m91560a2.m91505c(false);
            try {
                m91564a.mo91326a(m91560a2, obj);
                m91560a2.m91512a(m91520a2);
                m91560a2.m91508b(m91511b2);
                m91560a2.m91505c(m91507c2);
                return stringWriter2.toString();
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            } catch (AssertionError e5) {
                AssertionError assertionError2 = new AssertionError("AssertionError (GSON pangle-v3200): " + e5.getMessage());
                assertionError2.initCause(e5);
                throw assertionError2;
            }
        } catch (IOException e6) {
            throw new JsonIOException(e6);
        }
    }

    /* renamed from: a */
    private static JsonWriter m91560a(Writer writer) throws IOException {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.m91505c(false);
        return jsonWriter;
    }

    /* renamed from: a */
    private <T> T m91563a(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean m91531q = jsonReader.m91531q();
        boolean z = true;
        jsonReader.m91552a(true);
        try {
            try {
                try {
                    jsonReader.mo91542f();
                    z = false;
                    return m91564a((TypeToken) TypeToken.m91567a(type)).mo91327a(jsonReader);
                } catch (EOFException e) {
                    if (z) {
                        jsonReader.m91552a(m91531q);
                        return null;
                    }
                    throw new JsonSyntaxException(e);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        } finally {
            jsonReader.m91552a(m91531q);
        }
    }

    /* renamed from: a */
    public final <T> T m91561a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.m91552a(false);
        T t = (T) m91563a(jsonReader, type);
        if (t != null) {
            try {
                if (jsonReader.mo91542f() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return t;
    }
}
