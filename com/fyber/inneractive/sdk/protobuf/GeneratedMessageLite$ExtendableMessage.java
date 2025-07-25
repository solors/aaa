package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends AbstractC15283a0 implements InterfaceC15229F0 {
    protected C15252N extensions = C15252N.f30192d;

    private void eagerlyMergeMessageSetExtension(AbstractC15348w abstractC15348w, C15278Y c15278y, C15234H c15234h, int i) throws IOException {
        parseExtension(abstractC15348w, c15234h, c15278y, (i << 3) | 2, i);
    }

    private void mergeMessageSetExtensionFromBytes(AbstractC15336s abstractC15336s, C15234H c15234h, C15278Y c15278y) throws IOException {
        InterfaceC15223D0 interfaceC15223D0;
        C15252N c15252n = this.extensions;
        InterfaceC15226E0 interfaceC15226E0 = (InterfaceC15226E0) c15252n.f30193a.get(c15278y.f30231d);
        if (interfaceC15226E0 != null) {
            interfaceC15223D0 = interfaceC15226E0.toBuilder();
        } else {
            interfaceC15223D0 = null;
        }
        if (interfaceC15223D0 == null) {
            interfaceC15223D0 = c15278y.f30230c.newBuilderForType();
        }
        AbstractC15270U abstractC15270U = (AbstractC15270U) interfaceC15223D0;
        abstractC15270U.getClass();
        try {
            AbstractC15348w mo76827d = abstractC15336s.mo76827d();
            abstractC15270U.m76941a(mo76827d, c15234h);
            mo76827d.mo76789a(0);
            Object m76943a = abstractC15270U.m76943a();
            C15252N ensureExtensionsAreMutable = ensureExtensionsAreMutable();
            C15276X c15276x = c15278y.f30231d;
            if (c15276x.f30222c.m76968a() == EnumC15248L1.ENUM) {
                m76943a = Integer.valueOf(((InterfaceC15295e0) m76943a).mo76885a());
            }
            ensureExtensionsAreMutable.m76955c(c15276x, m76943a);
        } catch (C15325o0 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading " + abstractC15270U.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }

    private <MessageType extends InterfaceC15226E0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC15348w abstractC15348w, C15234H c15234h) throws IOException {
        int i = 0;
        C15330q c15330q = null;
        C15278Y c15278y = null;
        while (true) {
            int mo76763t = abstractC15348w.mo76763t();
            if (mo76763t == 0) {
                break;
            } else if (mo76763t == 16) {
                i = abstractC15348w.mo76762u();
                if (i != 0) {
                    c15278y = c15234h.m76999a(i, messagetype);
                }
            } else if (mo76763t == 26) {
                if (i != 0 && c15278y != null) {
                    eagerlyMergeMessageSetExtension(abstractC15348w, c15278y, c15234h, i);
                    c15330q = null;
                } else {
                    c15330q = abstractC15348w.mo76779e();
                }
            } else if (!abstractC15348w.mo76778e(mo76763t)) {
                break;
            }
        }
        abstractC15348w.mo76789a(12);
        if (c15330q != null && i != 0) {
            if (c15278y != null) {
                mergeMessageSetExtensionFromBytes(c15330q, c15234h, c15278y);
            } else {
                mergeLengthDelimitedField(i, c15330q);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Type inference failed for: r10v27, types: [com.fyber.inneractive.sdk.protobuf.e0] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Integer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.AbstractC15348w r7, com.fyber.inneractive.sdk.protobuf.C15234H r8, com.fyber.inneractive.sdk.protobuf.C15278Y r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.w, com.fyber.inneractive.sdk.protobuf.H, com.fyber.inneractive.sdk.protobuf.Y, int, int):boolean");
    }

    private void verifyExtensionContainingType(C15278Y c15278y) {
        if (c15278y.f30228a == getDefaultInstanceForType()) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public C15252N ensureExtensionsAreMutable() {
        C15252N c15252n = this.extensions;
        if (c15252n.f30194b) {
            this.extensions = c15252n.m110191clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.m76956c();
    }

    public int extensionsSerializedSize() {
        return this.extensions.m76959b();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.m76964a();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15283a0, com.fyber.inneractive.sdk.protobuf.InterfaceC15229F0
    public /* bridge */ /* synthetic */ InterfaceC15226E0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(AbstractC15225E abstractC15225E) {
        C15278Y access$000 = AbstractC15283a0.access$000(abstractC15225E);
        verifyExtensionContainingType(access$000);
        Type type = (Type) this.extensions.f30193a.get(access$000.f30231d);
        if (type == null) {
            return (Type) access$000.f30229b;
        }
        C15276X c15276x = access$000.f30231d;
        if (!c15276x.f30223d) {
            return c15276x.f30222c.m76968a() == EnumC15248L1.ENUM ? (Type) access$000.f30231d.f30220a.mo76884a(((Integer) type).intValue()) : type;
        } else if (c15276x.f30222c.m76968a() == EnumC15248L1.ENUM) {
            ?? r1 = (Type) new ArrayList();
            for (Object obj : (List) type) {
                if (access$000.f30231d.f30222c.m76968a() == EnumC15248L1.ENUM) {
                    obj = access$000.f30231d.f30220a.mo76884a(((Integer) obj).intValue());
                }
                r1.add(obj);
            }
            return r1;
        } else {
            return type;
        }
    }

    public final <Type> int getExtensionCount(AbstractC15225E abstractC15225E) {
        C15278Y access$000 = AbstractC15283a0.access$000(abstractC15225E);
        verifyExtensionContainingType(access$000);
        C15252N c15252n = this.extensions;
        C15276X c15276x = access$000.f30231d;
        c15252n.getClass();
        if (c15276x.f30223d) {
            Object obj = c15252n.f30193a.get(c15276x);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final <Type> boolean hasExtension(AbstractC15225E abstractC15225E) {
        C15278Y access$000 = AbstractC15283a0.access$000(abstractC15225E);
        verifyExtensionContainingType(access$000);
        C15252N c15252n = this.extensions;
        C15276X c15276x = access$000.f30231d;
        c15252n.getClass();
        if (!c15276x.f30223d) {
            if (c15252n.f30193a.get(c15276x) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        C15252N c15252n = this.extensions;
        if (c15252n.f30194b) {
            this.extensions = c15252n.m110191clone();
        }
        this.extensions.m76962a(messagetype.extensions);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15283a0, com.fyber.inneractive.sdk.protobuf.InterfaceC15226E0
    public /* bridge */ /* synthetic */ InterfaceC15223D0 newBuilderForType() {
        return newBuilderForType();
    }

    public C15274W newExtensionWriter() {
        return new C15274W(this);
    }

    public C15274W newMessageSetExtensionWriter() {
        return new C15274W(this);
    }

    public <MessageType extends InterfaceC15226E0> boolean parseUnknownField(MessageType messagetype, AbstractC15348w abstractC15348w, C15234H c15234h, int i) throws IOException {
        int i2 = i >>> 3;
        return parseExtension(abstractC15348w, c15234h, c15234h.m76999a(i2, messagetype), i, i2);
    }

    public <MessageType extends InterfaceC15226E0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC15348w abstractC15348w, C15234H c15234h, int i) throws IOException {
        if (i == 11) {
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC15348w, c15234h);
            return true;
        } else if ((i & 7) == 2) {
            return parseUnknownField(messagetype, abstractC15348w, c15234h, i);
        } else {
            return abstractC15348w.mo76778e(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15283a0, com.fyber.inneractive.sdk.protobuf.InterfaceC15226E0
    public /* bridge */ /* synthetic */ InterfaceC15223D0 toBuilder() {
        return toBuilder();
    }

    public final <Type> Type getExtension(AbstractC15225E abstractC15225E, int i) {
        C15278Y access$000 = AbstractC15283a0.access$000(abstractC15225E);
        verifyExtensionContainingType(access$000);
        C15252N c15252n = this.extensions;
        C15276X c15276x = access$000.f30231d;
        c15252n.getClass();
        if (c15276x.f30223d) {
            Object obj = c15252n.f30193a.get(c15276x);
            if (obj != null) {
                Type type = (Type) ((List) obj).get(i);
                return access$000.f30231d.f30222c.m76968a() == EnumC15248L1.ENUM ? (Type) access$000.f30231d.f30220a.mo76884a(((Integer) type).intValue()) : type;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
