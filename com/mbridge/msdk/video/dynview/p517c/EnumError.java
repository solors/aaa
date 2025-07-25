package com.mbridge.msdk.video.dynview.p517c;

/* renamed from: com.mbridge.msdk.video.dynview.c.a */
/* loaded from: classes6.dex */
public enum EnumError {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");
    

    /* renamed from: g */
    private int f60261g;

    /* renamed from: h */
    private String f60262h;

    EnumError(int i, String str) {
        this.f60261g = i;
        this.f60262h = str;
    }

    /* renamed from: a */
    public final int m49017a() {
        return this.f60261g;
    }

    /* renamed from: b */
    public final String m49015b() {
        return this.f60262h;
    }
}
