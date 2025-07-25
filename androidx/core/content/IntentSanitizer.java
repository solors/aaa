package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.textclassifier.TextLinks;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class IntentSanitizer {
    private static final String TAG = "IntentSanitizer";
    private boolean mAllowAnyComponent;
    private boolean mAllowClipDataText;
    private boolean mAllowIdentifier;
    private boolean mAllowSelector;
    private boolean mAllowSourceBounds;
    private Predicate<String> mAllowedActions;
    private Predicate<String> mAllowedCategories;
    private Predicate<ClipData> mAllowedClipData;
    private Predicate<Uri> mAllowedClipDataUri;
    private Predicate<ComponentName> mAllowedComponents;
    private Predicate<Uri> mAllowedData;
    private Map<String, Predicate<Object>> mAllowedExtras;
    private int mAllowedFlags;
    private Predicate<String> mAllowedPackages;
    private Predicate<String> mAllowedTypes;

    @RequiresApi(15)
    /* loaded from: classes.dex */
    public static class Api15Impl {
        private Api15Impl() {
        }

        @DoNotInline
        static Intent getSelector(Intent intent) {
            return intent.getSelector();
        }

        @DoNotInline
        static void setSelector(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    @RequiresApi(16)
    /* loaded from: classes.dex */
    public static class Api16Impl {

        @RequiresApi(31)
        /* loaded from: classes.dex */
        public static class Api31Impl {
            private Api31Impl() {
            }

            @DoNotInline
            static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
                TextLinks textLinks;
                if (item.getHtmlText() == null && item.getIntent() == null) {
                    textLinks = item.getTextLinks();
                    if (textLinks == null) {
                        return;
                    }
                }
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        private Api16Impl() {
        }

        private static void checkOtherMembers(int i, ClipData.Item item, Consumer<String> consumer) {
            if (item.getHtmlText() != null || item.getIntent() != null) {
                consumer.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00cd  */
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static void sanitizeClipData(@androidx.annotation.NonNull android.content.Intent r7, android.content.Intent r8, androidx.core.util.Predicate<android.content.ClipData> r9, boolean r10, androidx.core.util.Predicate<android.net.Uri> r11, androidx.core.util.Consumer<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lde
            L14:
                r9 = 0
                r0 = 0
                r1 = r9
            L17:
                int r2 = r7.getItemCount()
                if (r0 >= r2) goto Ld9
                android.content.ClipData$Item r2 = r7.getItemAt(r0)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                androidx.core.content.IntentSanitizer.Api16Impl.Api31Impl.checkOtherMembers(r0, r2, r12)
                goto L2e
            L2b:
                checkOtherMembers(r0, r2, r12)
            L2e:
                if (r10 == 0) goto L35
                java.lang.CharSequence r3 = r2.getText()
                goto L5c
            L35:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L5b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L5b:
                r3 = r9
            L5c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L85
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto Lb2
            L85:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L96
                goto Lb4
            L96:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            Lb2:
                r2 = r9
                goto Lb8
            Lb4:
                android.net.Uri r2 = r2.getUri()
            Lb8:
                if (r3 != 0) goto Lbc
                if (r2 == 0) goto Ld5
            Lbc:
                if (r1 != 0) goto Lcd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r9, r2)
                r1.<init>(r4, r5)
                goto Ld5
            Lcd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r9, r2)
                r1.addItem(r4)
            Ld5:
                int r0 = r0 + 1
                goto L17
            Ld9:
                if (r1 == 0) goto Lde
                r8.setClipData(r1)
            Lde:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.IntentSanitizer.Api16Impl.sanitizeClipData(android.content.Intent, android.content.Intent, androidx.core.util.Predicate, boolean, androidx.core.util.Predicate, androidx.core.util.Consumer):void");
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static String getIdentifier(Intent intent) {
            String identifier;
            identifier = intent.getIdentifier();
            return identifier;
        }

        @DoNotInline
        static Intent setIdentifier(Intent intent, String str) {
            Intent identifier;
            identifier = intent.setIdentifier(str);
            return identifier;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private static final int HISTORY_STACK_FLAGS = 2112614400;
        private static final int RECEIVER_FLAGS = 2015363072;
        private boolean mAllowAnyComponent;
        private boolean mAllowIdentifier;
        private boolean mAllowSelector;
        private boolean mAllowSomeComponents;
        private boolean mAllowSourceBounds;
        private int mAllowedFlags;
        private Predicate<String> mAllowedActions = new Predicate() { // from class: androidx.core.content.u
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105147e((String) obj);
            }
        };
        private Predicate<Uri> mAllowedData = new Predicate() { // from class: androidx.core.content.v
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105143i((Uri) obj);
            }
        };
        private Predicate<String> mAllowedTypes = new Predicate() { // from class: androidx.core.content.w
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105151a((String) obj);
            }
        };
        private Predicate<String> mAllowedCategories = new Predicate() { // from class: androidx.core.content.x
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105142j((String) obj);
            }
        };
        private Predicate<String> mAllowedPackages = new Predicate() { // from class: androidx.core.content.y
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105144h((String) obj);
            }
        };
        private Predicate<ComponentName> mAllowedComponents = new Predicate() { // from class: androidx.core.content.z
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105137o((ComponentName) obj);
            }
        };
        private Map<String, Predicate<Object>> mAllowedExtras = new HashMap();
        private boolean mAllowClipDataText = false;
        private Predicate<Uri> mAllowedClipDataUri = new Predicate() { // from class: androidx.core.content.a0
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105150b((Uri) obj);
            }
        };
        private Predicate<ClipData> mAllowedClipData = new Predicate() { // from class: androidx.core.content.b0
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return IntentSanitizer.Builder.m105135q((ClipData) obj);
            }
        };

        /* renamed from: a */
        public static /* synthetic */ boolean m105151a(String str) {
            return lambda$new$2(str);
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m105150b(Uri uri) {
            return lambda$new$6(uri);
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m105149c(String str, Uri uri) {
            return lambda$allowExtraOutput$16(str, uri);
        }

        /* renamed from: d */
        public static /* synthetic */ boolean m105148d(ComponentName componentName) {
            return lambda$allowAnyComponent$10(componentName);
        }

        /* renamed from: e */
        public static /* synthetic */ boolean m105147e(String str) {
            return lambda$new$0(str);
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m105146f(Object obj) {
            return lambda$allowExtra$14(obj);
        }

        /* renamed from: g */
        public static /* synthetic */ boolean m105145g(String str, Uri uri) {
            return lambda$allowClipDataUriWithAuthority$11(str, uri);
        }

        /* renamed from: h */
        public static /* synthetic */ boolean m105144h(String str) {
            return lambda$new$4(str);
        }

        /* renamed from: i */
        public static /* synthetic */ boolean m105143i(Uri uri) {
            return lambda$new$1(uri);
        }

        /* renamed from: j */
        public static /* synthetic */ boolean m105142j(String str) {
            return lambda$new$3(str);
        }

        /* renamed from: k */
        public static /* synthetic */ boolean m105141k(String str, Uri uri) {
            return lambda$allowDataWithAuthority$8(str, uri);
        }

        /* renamed from: l */
        public static /* synthetic */ boolean m105140l(Object obj) {
            return lambda$allowExtra$12(obj);
        }

        public static /* synthetic */ boolean lambda$allowAnyComponent$10(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean lambda$allowClipDataUriWithAuthority$11(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean lambda$allowComponentWithPackage$9(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        public static /* synthetic */ boolean lambda$allowDataWithAuthority$8(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean lambda$allowExtra$12(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean lambda$allowExtra$13(Class cls, Predicate predicate, Object obj) {
            if (cls.isInstance(obj) && predicate.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ boolean lambda$allowExtra$14(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean lambda$allowExtraOutput$16(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean lambda$allowExtraStreamUriWithAuthority$15(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean lambda$new$0(String str) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$1(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$2(String str) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$3(String str) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$4(String str) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$5(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$6(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean lambda$new$7(ClipData clipData) {
            return false;
        }

        /* renamed from: m */
        public static /* synthetic */ boolean m105139m(String str, ComponentName componentName) {
            return lambda$allowComponentWithPackage$9(str, componentName);
        }

        /* renamed from: n */
        public static /* synthetic */ boolean m105138n(String str, Uri uri) {
            return lambda$allowExtraStreamUriWithAuthority$15(str, uri);
        }

        /* renamed from: o */
        public static /* synthetic */ boolean m105137o(ComponentName componentName) {
            return lambda$new$5(componentName);
        }

        /* renamed from: p */
        public static /* synthetic */ boolean m105136p(Class cls, Predicate predicate, Object obj) {
            return lambda$allowExtra$13(cls, predicate, obj);
        }

        /* renamed from: q */
        public static /* synthetic */ boolean m105135q(ClipData clipData) {
            return lambda$new$7(clipData);
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            allowAction(new C1280l(str));
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAnyComponent() {
            this.mAllowAnyComponent = true;
            this.mAllowedComponents = new Predicate() { // from class: androidx.core.content.n
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105148d((ComponentName) obj);
                }
            };
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowCategory(new C1280l(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipData(@NonNull Predicate<ClipData> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipData = this.mAllowedClipData.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataText() {
            this.mAllowClipDataText = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUri(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedClipDataUri = this.mAllowedClipDataUri.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowClipDataUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowClipDataUri(new Predicate() { // from class: androidx.core.content.k
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105145g(str, (Uri) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull final ComponentName componentName) {
            Preconditions.checkNotNull(componentName);
            Objects.requireNonNull(componentName);
            return allowComponent(new Predicate() { // from class: androidx.core.content.s
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponentWithPackage(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            return allowComponent(new Predicate() { // from class: androidx.core.content.p
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105139m(str, (ComponentName) obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowData(@NonNull Predicate<Uri> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedData = this.mAllowedData.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowDataWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowData(new Predicate() { // from class: androidx.core.content.q
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105141k(str, (Uri) obj);
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Class<?> cls) {
            return allowExtra(str, cls, new Predicate() { // from class: androidx.core.content.t
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105140l(obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull final String str) {
            allowExtra("output", Uri.class, new Predicate() { // from class: androidx.core.content.r
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105149c(str, (Uri) obj);
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStream(@NonNull Predicate<Uri> predicate) {
            allowExtra("android.intent.extra.STREAM", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraStreamUriWithAuthority(@NonNull final String str) {
            Preconditions.checkNotNull(str);
            allowExtra("android.intent.extra.STREAM", Uri.class, new Predicate() { // from class: androidx.core.content.m
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105138n(str, (Uri) obj);
                }
            });
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowFlags(int i) {
            this.mAllowedFlags = i | this.mAllowedFlags;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowHistoryStackFlags() {
            this.mAllowedFlags |= HISTORY_STACK_FLAGS;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowIdentifier() {
            this.mAllowIdentifier = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowPackage(new C1280l(str));
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowReceiverFlags() {
            this.mAllowedFlags |= RECEIVER_FLAGS;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSelector() {
            this.mAllowSelector = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowSourceBounds() {
            this.mAllowSourceBounds = true;
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull String str) {
            Preconditions.checkNotNull(str);
            Objects.requireNonNull(str);
            return allowType(new C1280l(str));
        }

        @NonNull
        @SuppressLint({"SyntheticAccessor"})
        public IntentSanitizer build() {
            boolean z = this.mAllowAnyComponent;
            if ((z && this.mAllowSomeComponents) || (!z && !this.mAllowSomeComponents)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer = new IntentSanitizer();
            intentSanitizer.mAllowedFlags = this.mAllowedFlags;
            intentSanitizer.mAllowedActions = this.mAllowedActions;
            intentSanitizer.mAllowedData = this.mAllowedData;
            intentSanitizer.mAllowedTypes = this.mAllowedTypes;
            intentSanitizer.mAllowedCategories = this.mAllowedCategories;
            intentSanitizer.mAllowedPackages = this.mAllowedPackages;
            intentSanitizer.mAllowAnyComponent = this.mAllowAnyComponent;
            intentSanitizer.mAllowedComponents = this.mAllowedComponents;
            intentSanitizer.mAllowedExtras = this.mAllowedExtras;
            intentSanitizer.mAllowClipDataText = this.mAllowClipDataText;
            intentSanitizer.mAllowedClipDataUri = this.mAllowedClipDataUri;
            intentSanitizer.mAllowedClipData = this.mAllowedClipData;
            intentSanitizer.mAllowIdentifier = this.mAllowIdentifier;
            intentSanitizer.mAllowSelector = this.mAllowSelector;
            intentSanitizer.mAllowSourceBounds = this.mAllowSourceBounds;
            return intentSanitizer;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public <T> Builder allowExtra(@NonNull String str, @NonNull final Class<T> cls, @NonNull final Predicate<T> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(predicate);
            return allowExtra(str, new Predicate() { // from class: androidx.core.content.o
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return IntentSanitizer.Builder.m105136p(cls, predicate, obj);
                }
            });
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtraOutput(@NonNull Predicate<Uri> predicate) {
            allowExtra("output", Uri.class, predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowAction(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedActions = this.mAllowedActions.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowCategory(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedCategories = this.mAllowedCategories.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowComponent(@NonNull Predicate<ComponentName> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowSomeComponents = true;
            this.mAllowedComponents = this.mAllowedComponents.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowPackage(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedPackages = this.mAllowedPackages.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowType(@NonNull Predicate<String> predicate) {
            Preconditions.checkNotNull(predicate);
            this.mAllowedTypes = this.mAllowedTypes.m104917or(predicate);
            return this;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public Builder allowExtra(@NonNull String str, @NonNull Predicate<Object> predicate) {
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(predicate);
            Predicate<Object> predicate2 = this.mAllowedExtras.get(str);
            if (predicate2 == null) {
                predicate2 = new Predicate() { // from class: androidx.core.content.j
                    @Override // androidx.core.util.Predicate
                    public final boolean test(Object obj) {
                        return IntentSanitizer.Builder.m105146f(obj);
                    }
                };
            }
            this.mAllowedExtras.put(str, predicate2.m104917or(predicate));
            return this;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m105153a(String str) {
        lambda$sanitizeByThrowing$1(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m105152b(String str) {
        lambda$sanitizeByFiltering$0(str);
    }

    public static /* synthetic */ void lambda$sanitizeByThrowing$1(String str) {
        throw new SecurityException(str);
    }

    private void putExtra(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @NonNull
    public Intent sanitize(@NonNull Intent intent, @NonNull Consumer<String> consumer) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.mAllowAnyComponent && component == null) || this.mAllowedComponents.test(component)) {
            intent2.setComponent(component);
        } else {
            consumer.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str != null && !this.mAllowedPackages.test(str)) {
            consumer.accept("Package is not allowed: " + str);
        } else {
            intent2.setPackage(str);
        }
        int flags = this.mAllowedFlags | intent.getFlags();
        int i = this.mAllowedFlags;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            consumer.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.mAllowedFlags)));
        }
        String action = intent.getAction();
        if (action != null && !this.mAllowedActions.test(action)) {
            consumer.accept("Action is not allowed: " + action);
        } else {
            intent2.setAction(action);
        }
        Uri data = intent.getData();
        if (data != null && !this.mAllowedData.test(data)) {
            consumer.accept("Data is not allowed: " + data);
        } else {
            intent2.setData(data);
        }
        String type = intent.getType();
        if (type != null && !this.mAllowedTypes.test(type)) {
            consumer.accept("Type is not allowed: " + type);
        } else {
            intent2.setDataAndType(intent2.getData(), type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.mAllowedCategories.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    consumer.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.mAllowedFlags & 1) == 0) {
                    consumer.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.mAllowedFlags) & 3) != 0) {
                    consumer.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    Object obj = extras.get(str3);
                    Predicate<Object> predicate = this.mAllowedExtras.get(str3);
                    if (predicate != null && predicate.test(obj)) {
                        putExtra(intent2, str3, obj);
                    } else {
                        consumer.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        Api16Impl.sanitizeClipData(intent, intent2, this.mAllowedClipData, this.mAllowClipDataText, this.mAllowedClipDataUri, consumer);
        if (i2 >= 29) {
            if (this.mAllowIdentifier) {
                Api29Impl.setIdentifier(intent2, Api29Impl.getIdentifier(intent));
            } else if (Api29Impl.getIdentifier(intent) != null) {
                consumer.accept("Identifier is not allowed: " + Api29Impl.getIdentifier(intent));
            }
        }
        if (this.mAllowSelector) {
            Api15Impl.setSelector(intent2, Api15Impl.getSelector(intent));
        } else if (Api15Impl.getSelector(intent) != null) {
            consumer.accept("Selector is not allowed: " + Api15Impl.getSelector(intent));
        }
        if (this.mAllowSourceBounds) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            consumer.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @NonNull
    public Intent sanitizeByFiltering(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: androidx.core.content.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m105152b((String) obj);
            }
        });
    }

    @NonNull
    public Intent sanitizeByThrowing(@NonNull Intent intent) {
        return sanitize(intent, new Consumer() { // from class: androidx.core.content.f
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                IntentSanitizer.m105153a((String) obj);
            }
        });
    }

    private IntentSanitizer() {
    }

    public static /* synthetic */ void lambda$sanitizeByFiltering$0(String str) {
    }
}
