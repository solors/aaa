package p856r2;

/* renamed from: r2.a */
/* loaded from: classes5.dex */
public class ChatResourceEvictStrategy implements ResourceCacheEvictStrategy {
    @Override // p856r2.ResourceCacheEvictStrategy
    /* renamed from: a */
    public boolean mo12683a(String str, String str2) {
        return str.startsWith(str2);
    }
}
