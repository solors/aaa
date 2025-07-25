package com.facebook.ads.redexgen.p370X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.db */
/* loaded from: assets/audience_network.dex */
public class C13245db {
    public static String[] A02 = {"FI4CSn5g4hVI", "oUnbtikCS", "OTKcg3hD6eE6nFWotwGGZ5F", "qSmHeLCnLYm7Z6Tg4tQ0z3dsx", "SCLx27yKxe6yDyiZK0iEJT9ptP", "bFFCI01IIFvt0fl9DXgL6XUawg", "6J2GgEdIUlJLk3yvVentjGe1dkRWCLvM", "KM6GnpQ6vjKv"};
    public final Map<String, C13257do> A00;
    public final Set<C13257do> A01;

    public C13245db() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C13257do> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C13257do> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        Iterator<C13257do> it = this.A01.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A02;
            if (strArr[5].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[6] = "aJOeJxsM87dt105FXzNZlrhAEbJ2aQd4";
            if (hasNext) {
                C13257do next = it.next();
                this.A00.put(next.A00, next);
            } else {
                this.A01.clear();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C13257do c13257do) {
        if (this.A01.add(c13257do)) {
            this.A00.remove(c13257do.A00);
            return true;
        }
        return false;
    }
}
