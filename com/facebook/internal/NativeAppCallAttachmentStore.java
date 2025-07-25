package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44983m;

/* compiled from: NativeAppCallAttachmentStore.kt */
@Metadata
/* loaded from: classes4.dex */
public final class NativeAppCallAttachmentStore {
    @NotNull
    public static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    @NotNull
    public static final NativeAppCallAttachmentStore INSTANCE = new NativeAppCallAttachmentStore();
    private static final String TAG = NativeAppCallAttachmentStore.class.getName();
    @Nullable
    private static File attachmentsDirectory;

    /* compiled from: NativeAppCallAttachmentStore.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Attachment {
        @Nullable
        private final String attachmentName;
        @NotNull
        private final String attachmentUrl;
        @Nullable
        private final Bitmap bitmap;
        @NotNull
        private final UUID callId;
        private boolean isContentUri;
        @Nullable
        private final Uri originalUri;
        private boolean shouldCreateFile;

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
            if (r7 == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Attachment(@org.jetbrains.annotations.NotNull java.util.UUID r6, @org.jetbrains.annotations.Nullable android.graphics.Bitmap r7, @org.jetbrains.annotations.Nullable android.net.Uri r8) {
            /*
                r5 = this;
                java.lang.String r0 = "callId"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r5.<init>()
                r5.callId = r6
                r5.bitmap = r7
                r5.originalUri = r8
                r0 = 0
                r1 = 1
                if (r8 == 0) goto L57
                java.lang.String r7 = r8.getScheme()
                java.lang.String r2 = "content"
                boolean r2 = kotlin.text.C37686h.m16656y(r2, r7, r1)
                if (r2 == 0) goto L35
                r5.isContentUri = r1
                java.lang.String r7 = r8.getAuthority()
                r2 = 0
                if (r7 == 0) goto L31
                java.lang.String r3 = "media"
                r4 = 2
                boolean r7 = kotlin.text.C37686h.m16713M(r7, r3, r2, r4, r0)
                if (r7 != 0) goto L31
                goto L32
            L31:
                r1 = r2
            L32:
                r5.shouldCreateFile = r1
                goto L5b
            L35:
                java.lang.String r2 = "file"
                java.lang.String r3 = r8.getScheme()
                boolean r2 = kotlin.text.C37686h.m16656y(r2, r3, r1)
                if (r2 == 0) goto L44
                r5.shouldCreateFile = r1
                goto L5b
            L44:
                boolean r1 = com.facebook.internal.Utility.isWebUri(r8)
                if (r1 == 0) goto L4b
                goto L5b
            L4b:
                com.facebook.FacebookException r6 = new com.facebook.FacebookException
                java.lang.String r8 = "Unsupported scheme for media Uri : "
                java.lang.String r7 = kotlin.jvm.internal.Intrinsics.m17064q(r8, r7)
                r6.<init>(r7)
                throw r6
            L57:
                if (r7 == 0) goto L80
                r5.shouldCreateFile = r1
            L5b:
                boolean r7 = r5.shouldCreateFile
                if (r7 != 0) goto L60
                goto L68
            L60:
                java.util.UUID r7 = java.util.UUID.randomUUID()
                java.lang.String r0 = r7.toString()
            L68:
                r5.attachmentName = r0
                boolean r7 = r5.shouldCreateFile
                if (r7 != 0) goto L73
                java.lang.String r6 = java.lang.String.valueOf(r8)
                goto L7d
            L73:
                com.facebook.FacebookContentProvider$Companion r7 = com.facebook.FacebookContentProvider.Companion
                java.lang.String r8 = com.facebook.FacebookSdk.getApplicationId()
                java.lang.String r6 = r7.getAttachmentUrl(r8, r6, r0)
            L7d:
                r5.attachmentUrl = r6
                return
            L80:
                com.facebook.FacebookException r6 = new com.facebook.FacebookException
                java.lang.String r7 = "Cannot share media without a bitmap or Uri set"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeAppCallAttachmentStore.Attachment.<init>(java.util.UUID, android.graphics.Bitmap, android.net.Uri):void");
        }

        @Nullable
        public final String getAttachmentName() {
            return this.attachmentName;
        }

        @NotNull
        public final String getAttachmentUrl() {
            return this.attachmentUrl;
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final UUID getCallId() {
            return this.callId;
        }

        @Nullable
        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final boolean getShouldCreateFile() {
            return this.shouldCreateFile;
        }

        public final boolean isContentUri() {
            return this.isContentUri;
        }

        public final void setContentUri(boolean z) {
            this.isContentUri = z;
        }

        public final void setShouldCreateFile(boolean z) {
            this.shouldCreateFile = z;
        }
    }

    private NativeAppCallAttachmentStore() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void addAttachments(@org.jetbrains.annotations.Nullable java.util.Collection<com.facebook.internal.NativeAppCallAttachmentStore.Attachment> r5) throws com.facebook.FacebookException {
        /*
            if (r5 == 0) goto L90
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto La
            goto L90
        La:
            java.io.File r0 = com.facebook.internal.NativeAppCallAttachmentStore.attachmentsDirectory
            if (r0 != 0) goto L11
            cleanupAllAttachments()
        L11:
            ensureAttachmentsDirectoryExists()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> L67
        L1d:
            boolean r1 = r5.hasNext()     // Catch: java.io.IOException -> L67
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()     // Catch: java.io.IOException -> L67
            com.facebook.internal.NativeAppCallAttachmentStore$Attachment r1 = (com.facebook.internal.NativeAppCallAttachmentStore.Attachment) r1     // Catch: java.io.IOException -> L67
            boolean r2 = r1.getShouldCreateFile()     // Catch: java.io.IOException -> L67
            if (r2 != 0) goto L30
            goto L1d
        L30:
            java.util.UUID r2 = r1.getCallId()     // Catch: java.io.IOException -> L67
            java.lang.String r3 = r1.getAttachmentName()     // Catch: java.io.IOException -> L67
            r4 = 1
            java.io.File r2 = getAttachmentFile(r2, r3, r4)     // Catch: java.io.IOException -> L67
            if (r2 == 0) goto L1d
            r0.add(r2)     // Catch: java.io.IOException -> L67
            android.graphics.Bitmap r3 = r1.getBitmap()     // Catch: java.io.IOException -> L67
            if (r3 == 0) goto L52
            com.facebook.internal.NativeAppCallAttachmentStore r3 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE     // Catch: java.io.IOException -> L67
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch: java.io.IOException -> L67
            r3.processAttachmentBitmap(r1, r2)     // Catch: java.io.IOException -> L67
            goto L1d
        L52:
            android.net.Uri r3 = r1.getOriginalUri()     // Catch: java.io.IOException -> L67
            if (r3 == 0) goto L1d
            com.facebook.internal.NativeAppCallAttachmentStore r3 = com.facebook.internal.NativeAppCallAttachmentStore.INSTANCE     // Catch: java.io.IOException -> L67
            android.net.Uri r4 = r1.getOriginalUri()     // Catch: java.io.IOException -> L67
            boolean r1 = r1.isContentUri()     // Catch: java.io.IOException -> L67
            r3.processAttachmentFile(r4, r1, r2)     // Catch: java.io.IOException -> L67
            goto L1d
        L66:
            return
        L67:
            r5 = move-exception
            java.lang.String r1 = com.facebook.internal.NativeAppCallAttachmentStore.TAG
            java.lang.String r2 = "Got unexpected exception:"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.m17064q(r2, r5)
            android.util.Log.e(r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            if (r1 != 0) goto L86
            goto L77
        L86:
            r1.delete()     // Catch: java.lang.Exception -> L77
            goto L77
        L8a:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            r0.<init>(r5)
            throw r0
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeAppCallAttachmentStore.addAttachments(java.util.Collection):void");
    }

    public static final void cleanupAllAttachments() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            C44983m.m1175r(attachmentsDirectory2);
        }
    }

    public static final void cleanupAttachmentsForCall(@NotNull UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, false);
        if (attachmentsDirectoryForCall != null) {
            C44983m.m1175r(attachmentsDirectoryForCall);
        }
    }

    @NotNull
    public static final Attachment createAttachment(@NotNull UUID callId, @NotNull Bitmap attachmentBitmap) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
        return new Attachment(callId, attachmentBitmap, null);
    }

    @Nullable
    public static final File ensureAttachmentsDirectoryExists() {
        File attachmentsDirectory2 = getAttachmentsDirectory();
        if (attachmentsDirectory2 != null) {
            attachmentsDirectory2.mkdirs();
        }
        return attachmentsDirectory2;
    }

    @Nullable
    public static final File getAttachmentFile(@NotNull UUID callId, @Nullable String str, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File attachmentsDirectoryForCall = getAttachmentsDirectoryForCall(callId, z);
        if (attachmentsDirectoryForCall == null) {
            return null;
        }
        try {
            return new File(attachmentsDirectoryForCall, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    public static final synchronized File getAttachmentsDirectory() {
        File file;
        synchronized (NativeAppCallAttachmentStore.class) {
            if (attachmentsDirectory == null) {
                attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), ATTACHMENTS_DIR_NAME);
            }
            file = attachmentsDirectory;
        }
        return file;
    }

    @Nullable
    public static final File getAttachmentsDirectoryForCall(@NotNull UUID callId, boolean z) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static final File openAttachment(@Nullable UUID uuid, @Nullable String str) throws FileNotFoundException {
        if (!Utility.isNullOrEmpty(str) && uuid != null) {
            try {
                return getAttachmentFile(uuid, str, false);
            } catch (IOException unused) {
                throw new FileNotFoundException();
            }
        }
        throw new FileNotFoundException();
    }

    private final void processAttachmentBitmap(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Utility.closeQuietly(fileOutputStream);
        }
    }

    private final void processAttachmentFile(Uri uri, boolean z, File file) throws IOException {
        InputStream openInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!z) {
                openInputStream = new FileInputStream(uri.getPath());
            } else {
                openInputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
            }
            Utility.copyAndCloseInputStream(openInputStream, fileOutputStream);
            Utility.closeQuietly(fileOutputStream);
        } catch (Throwable th) {
            Utility.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    @NotNull
    public static final Attachment createAttachment(@NotNull UUID callId, @NotNull Uri attachmentUri) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentUri, "attachmentUri");
        return new Attachment(callId, null, attachmentUri);
    }
}
