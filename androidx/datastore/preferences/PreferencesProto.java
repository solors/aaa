package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class PreferencesProto {

    /* renamed from: androidx.datastore.preferences.PreferencesProto$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C17481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f653xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f653xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f653xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.emptyMapField();

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
            /* synthetic */ Builder(C17481 c17481) {
                this();
            }

            public Builder clearPreferences() {
                copyOnWrite();
                ((PreferenceMap) this.instance).getMutablePreferencesMap().clear();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public boolean containsPreferences(String str) {
                str.getClass();
                return ((PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            @Deprecated
            public Map<String, Value> getPreferences() {
                return getPreferencesMap();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public int getPreferencesCount() {
                return ((PreferenceMap) this.instance).getPreferencesMap().size();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Map<String, Value> getPreferencesMap() {
                return Collections.unmodifiableMap(((PreferenceMap) this.instance).getPreferencesMap());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Value getPreferencesOrDefault(String str, Value value) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                if (preferencesMap.containsKey(str)) {
                    return preferencesMap.get(str);
                }
                return value;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Value getPreferencesOrThrow(String str) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                if (preferencesMap.containsKey(str)) {
                    return preferencesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllPreferences(Map<String, Value> map) {
                copyOnWrite();
                ((PreferenceMap) this.instance).getMutablePreferencesMap().putAll(map);
                return this;
            }

            public Builder putPreferences(String str, Value value) {
                str.getClass();
                value.getClass();
                copyOnWrite();
                ((PreferenceMap) this.instance).getMutablePreferencesMap().put(str, value);
                return this;
            }

            public Builder removePreferences(String str) {
                str.getClass();
                copyOnWrite();
                ((PreferenceMap) this.instance).getMutablePreferencesMap().remove(str);
                return this;
            }

            private Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes.dex */
        private static final class PreferencesDefaultEntryHolder {
            static final MapEntryLite<String, Value> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());

            private PreferencesDefaultEntryHolder() {
            }
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.registerDefaultInstance(PreferenceMap.class, preferenceMap);
        }

        private PreferenceMap() {
        }

        public static PreferenceMap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Value> getMutablePreferencesMap() {
            return internalGetMutablePreferences();
        }

        private MapFieldLite<String, Value> internalGetMutablePreferences() {
            if (!this.preferences_.isMutable()) {
                this.preferences_ = this.preferences_.mutableCopy();
            }
            return this.preferences_;
        }

        private MapFieldLite<String, Value> internalGetPreferences() {
            return this.preferences_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PreferenceMap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public boolean containsPreferences(String str) {
            str.getClass();
            return internalGetPreferences().containsKey(str);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C17481.f653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreferenceMap();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", PreferencesDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PreferenceMap> parser = PARSER;
                    if (parser == null) {
                        synchronized (PreferenceMap.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        @Deprecated
        public Map<String, Value> getPreferences() {
            return getPreferencesMap();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public int getPreferencesCount() {
            return internalGetPreferences().size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Map<String, Value> getPreferencesMap() {
            return Collections.unmodifiableMap(internalGetPreferences());
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Value getPreferencesOrDefault(String str, Value value) {
            str.getClass();
            MapFieldLite<String, Value> internalGetPreferences = internalGetPreferences();
            if (internalGetPreferences.containsKey(str)) {
                return internalGetPreferences.get(str);
            }
            return value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Value getPreferencesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Value> internalGetPreferences = internalGetPreferences();
            if (internalGetPreferences.containsKey(str)) {
                return internalGetPreferences.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(PreferenceMap preferenceMap) {
            return DEFAULT_INSTANCE.createBuilder(preferenceMap);
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PreferenceMap parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PreferenceMap parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes.dex */
    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
        boolean containsPreferences(String str);

        @Deprecated
        Map<String, Value> getPreferences();

        int getPreferencesCount();

        Map<String, Value> getPreferencesMap();

        Value getPreferencesOrDefault(String str, Value value);

        Value getPreferencesOrThrow(String str);
    }

    /* loaded from: classes.dex */
    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
            /* synthetic */ Builder(C17481 c17481) {
                this();
            }

            public Builder addAllStrings(Iterable<String> iterable) {
                copyOnWrite();
                ((StringSet) this.instance).addAllStrings(iterable);
                return this;
            }

            public Builder addStrings(String str) {
                copyOnWrite();
                ((StringSet) this.instance).addStrings(str);
                return this;
            }

            public Builder addStringsBytes(ByteString byteString) {
                copyOnWrite();
                ((StringSet) this.instance).addStringsBytes(byteString);
                return this;
            }

            public Builder clearStrings() {
                copyOnWrite();
                ((StringSet) this.instance).clearStrings();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public String getStrings(int i) {
                return ((StringSet) this.instance).getStrings(i);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public ByteString getStringsBytes(int i) {
                return ((StringSet) this.instance).getStringsBytes(i);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public int getStringsCount() {
                return ((StringSet) this.instance).getStringsCount();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public List<String> getStringsList() {
                return Collections.unmodifiableList(((StringSet) this.instance).getStringsList());
            }

            public Builder setStrings(int i, String str) {
                copyOnWrite();
                ((StringSet) this.instance).setStrings(i, str);
                return this;
            }

            private Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.registerDefaultInstance(StringSet.class, stringSet);
        }

        private StringSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStrings(Iterable<String> iterable) {
            ensureStringsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.strings_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStrings(String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStringsBytes(ByteString byteString) {
            byteString.getClass();
            ensureStringsIsMutable();
            this.strings_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrings() {
            this.strings_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureStringsIsMutable() {
            if (!this.strings_.isModifiable()) {
                this.strings_ = GeneratedMessageLite.mutableCopy(this.strings_);
            }
        }

        public static StringSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StringSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrings(int i, String str) {
            str.getClass();
            ensureStringsIsMutable();
            this.strings_.set(i, str);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C17481.f653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringSet();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StringSet> parser = PARSER;
                    if (parser == null) {
                        synchronized (StringSet.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public String getStrings(int i) {
            return this.strings_.get(i);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public ByteString getStringsBytes(int i) {
            return ByteString.copyFromUtf8(this.strings_.get(i));
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public List<String> getStringsList() {
            return this.strings_;
        }

        public static Builder newBuilder(StringSet stringSet) {
            return DEFAULT_INSTANCE.createBuilder(stringSet);
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StringSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StringSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StringSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StringSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StringSet parseFrom(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes.dex */
    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
        String getStrings(int i);

        ByteString getStringsBytes(int i);

        int getStringsCount();

        List<String> getStringsList();
    }

    /* loaded from: classes.dex */
    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
            /* synthetic */ Builder(C17481 c17481) {
                this();
            }

            public Builder clearBoolean() {
                copyOnWrite();
                ((Value) this.instance).clearBoolean();
                return this;
            }

            public Builder clearDouble() {
                copyOnWrite();
                ((Value) this.instance).clearDouble();
                return this;
            }

            public Builder clearFloat() {
                copyOnWrite();
                ((Value) this.instance).clearFloat();
                return this;
            }

            public Builder clearInteger() {
                copyOnWrite();
                ((Value) this.instance).clearInteger();
                return this;
            }

            public Builder clearLong() {
                copyOnWrite();
                ((Value) this.instance).clearLong();
                return this;
            }

            public Builder clearString() {
                copyOnWrite();
                ((Value) this.instance).clearString();
                return this;
            }

            public Builder clearStringSet() {
                copyOnWrite();
                ((Value) this.instance).clearStringSet();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Value) this.instance).clearValue();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean getBoolean() {
                return ((Value) this.instance).getBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public double getDouble() {
                return ((Value) this.instance).getDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public float getFloat() {
                return ((Value) this.instance).getFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public int getInteger() {
                return ((Value) this.instance).getInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public long getLong() {
                return ((Value) this.instance).getLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public String getString() {
                return ((Value) this.instance).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public ByteString getStringBytes() {
                return ((Value) this.instance).getStringBytes();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public StringSet getStringSet() {
                return ((Value) this.instance).getStringSet();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public ValueCase getValueCase() {
                return ((Value) this.instance).getValueCase();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasBoolean() {
                return ((Value) this.instance).hasBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasDouble() {
                return ((Value) this.instance).hasDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasFloat() {
                return ((Value) this.instance).hasFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasInteger() {
                return ((Value) this.instance).hasInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasLong() {
                return ((Value) this.instance).hasLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasString() {
                return ((Value) this.instance).hasString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasStringSet() {
                return ((Value) this.instance).hasStringSet();
            }

            public Builder mergeStringSet(StringSet stringSet) {
                copyOnWrite();
                ((Value) this.instance).mergeStringSet(stringSet);
                return this;
            }

            public Builder setBoolean(boolean z) {
                copyOnWrite();
                ((Value) this.instance).setBoolean(z);
                return this;
            }

            public Builder setDouble(double d) {
                copyOnWrite();
                ((Value) this.instance).setDouble(d);
                return this;
            }

            public Builder setFloat(float f) {
                copyOnWrite();
                ((Value) this.instance).setFloat(f);
                return this;
            }

            public Builder setInteger(int i) {
                copyOnWrite();
                ((Value) this.instance).setInteger(i);
                return this;
            }

            public Builder setLong(long j) {
                copyOnWrite();
                ((Value) this.instance).setLong(j);
                return this;
            }

            public Builder setString(String str) {
                copyOnWrite();
                ((Value) this.instance).setString(str);
                return this;
            }

            public Builder setStringBytes(ByteString byteString) {
                copyOnWrite();
                ((Value) this.instance).setStringBytes(byteString);
                return this;
            }

            public Builder setStringSet(StringSet stringSet) {
                copyOnWrite();
                ((Value) this.instance).setStringSet(stringSet);
                return this;
            }

            private Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public Builder setStringSet(StringSet.Builder builder) {
                copyOnWrite();
                ((Value) this.instance).setStringSet(builder);
                return this;
            }
        }

        /* loaded from: classes.dex */
        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);
            
            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.registerDefaultInstance(Value.class, value);
        }

        private Value() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolean() {
            if (this.valueCase_ == 1) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDouble() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloat() {
            if (this.valueCase_ == 2) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInteger() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLong() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearString() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringSet() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStringSet(StringSet stringSet) {
            stringSet.getClass();
            if (this.valueCase_ == 6 && this.value_ != StringSet.getDefaultInstance()) {
                this.value_ = StringSet.newBuilder((StringSet) this.value_).mergeFrom((StringSet.Builder) stringSet).buildPartial();
            } else {
                this.value_ = stringSet;
            }
            this.valueCase_ = 6;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Value> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolean(boolean z) {
            this.valueCase_ = 1;
            this.value_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDouble(double d) {
            this.valueCase_ = 7;
            this.value_ = Double.valueOf(d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloat(float f) {
            this.valueCase_ = 2;
            this.value_ = Float.valueOf(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteger(int i) {
            this.valueCase_ = 3;
            this.value_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLong(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setString(String str) {
            str.getClass();
            this.valueCase_ = 5;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringBytes(ByteString byteString) {
            byteString.getClass();
            this.valueCase_ = 5;
            this.value_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringSet(StringSet stringSet) {
            stringSet.getClass();
            this.value_ = stringSet;
            this.valueCase_ = 6;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C17481.f653xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Value> parser = PARSER;
                    if (parser == null) {
                        synchronized (Value.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public String getString() {
            if (this.valueCase_ == 5) {
                return (String) this.value_;
            }
            return "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public ByteString getStringBytes() {
            String str;
            if (this.valueCase_ == 5) {
                str = (String) this.value_;
            } else {
                str = "";
            }
            return ByteString.copyFromUtf8(str);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public StringSet getStringSet() {
            if (this.valueCase_ == 6) {
                return (StringSet) this.value_;
            }
            return StringSet.getDefaultInstance();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasBoolean() {
            if (this.valueCase_ == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasDouble() {
            if (this.valueCase_ == 7) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasFloat() {
            if (this.valueCase_ == 2) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasInteger() {
            if (this.valueCase_ == 3) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasLong() {
            if (this.valueCase_ == 4) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasString() {
            if (this.valueCase_ == 5) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasStringSet() {
            if (this.valueCase_ == 6) {
                return true;
            }
            return false;
        }

        public static Builder newBuilder(Value value) {
            return DEFAULT_INSTANCE.createBuilder(value);
        }

        public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringSet(StringSet.Builder builder) {
            this.value_ = builder.build();
            this.valueCase_ = 6;
        }

        public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Value parseFrom(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* loaded from: classes.dex */
    public interface ValueOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolean();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        String getString();

        ByteString getStringBytes();

        StringSet getStringSet();

        Value.ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    private PreferencesProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
