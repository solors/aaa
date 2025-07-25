package com.inmobi.media;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.aa */
/* loaded from: classes6.dex */
public final class C19205aa extends Lambda implements Functions {

    /* renamed from: a */
    public static final C19205aa f48070a = new C19205aa();

    public C19205aa() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        JSONObject m61086a = AbstractC18953H9.m61086a("left", 0, ViewHierarchyConstants.DIMENSION_TOP_KEY, 0);
        m61086a.put("right", 0);
        return m61086a.put("bottom", 0);
    }
}
