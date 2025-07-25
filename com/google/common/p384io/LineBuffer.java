package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.LineBuffer */
/* loaded from: classes4.dex */
abstract class LineBuffer {

    /* renamed from: a */
    private StringBuilder f41306a = new StringBuilder();

    /* renamed from: b */
    private boolean f41307b;

    @CanIgnoreReturnValue
    /* renamed from: c */
    private boolean m68215c(boolean z) throws IOException {
        String str;
        if (this.f41307b) {
            if (z) {
                str = "\r\n";
            } else {
                str = "\r";
            }
        } else if (z) {
            str = "\n";
        } else {
            str = "";
        }
        mo68213d(this.f41306a.toString(), str);
        this.f41306a = new StringBuilder();
        this.f41307b = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m68217a(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f41307b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r1
        L11:
            boolean r0 = r6.m68215c(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L52
            char r4 = r7[r0]
            if (r4 == r2) goto L44
            r5 = 13
            if (r4 == r5) goto L28
            goto L50
        L28:
            java.lang.StringBuilder r4 = r6.f41306a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f41307b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L4e
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = r3
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r4 = r6.m68215c(r4)
            if (r4 == 0) goto L4e
            r0 = r9
            goto L4e
        L44:
            java.lang.StringBuilder r4 = r6.f41306a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.m68215c(r3)
        L4e:
            int r9 = r0 + 1
        L50:
            int r0 = r0 + r3
            goto L1d
        L52:
            java.lang.StringBuilder r0 = r6.f41306a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p384io.LineBuffer.m68217a(char[], int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m68216b() throws IOException {
        if (this.f41307b || this.f41306a.length() > 0) {
            m68215c(false);
        }
    }

    /* renamed from: d */
    protected abstract void mo68213d(String str, String str2) throws IOException;
}
