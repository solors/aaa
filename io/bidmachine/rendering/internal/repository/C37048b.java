package io.bidmachine.rendering.internal.repository;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.FileUtils;
import io.bidmachine.rendering.utils.ImageUtils;
import io.bidmachine.rendering.utils.NetworkRequest;
import java.io.File;

/* renamed from: io.bidmachine.rendering.internal.repository.b */
/* loaded from: classes9.dex */
public class C37048b implements InterfaceC37047a {

    /* renamed from: io.bidmachine.rendering.internal.repository.b$a */
    /* loaded from: classes9.dex */
    class C37049a extends AbstractC37052d {
        C37049a(InterfaceC37054c interfaceC37054c) {
            super(interfaceC37054c, null);
        }

        @Override // io.bidmachine.rendering.internal.repository.C37048b.AbstractC37052d
        /* renamed from: a */
        Error mo19141a() {
            return new Error("Bitmap is null");
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.repository.b$b */
    /* loaded from: classes9.dex */
    class C37050b extends AbstractC37052d {
        C37050b(InterfaceC37054c interfaceC37054c) {
            super(interfaceC37054c, null);
        }

        @Override // io.bidmachine.rendering.internal.repository.C37048b.AbstractC37052d
        /* renamed from: a */
        Error mo19141a() {
            return new Error("Uri is null");
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.repository.b$c */
    /* loaded from: classes9.dex */
    private static class C37051c extends NetworkRequest.FileOutputStreamProcessor {

        /* renamed from: c */
        private final BitmapFactory.Options f97754c;

        private C37051c(Context context, File file, BitmapFactory.Options options) {
            super(context, file);
            this.f97754c = options;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* renamed from: a */
        public Bitmap transform(File file) {
            return ImageUtils.toBitmap(file, this.f97754c);
        }

        /* synthetic */ C37051c(Context context, File file, BitmapFactory.Options options, C37049a c37049a) {
            this(context, file, options);
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.repository.b$d */
    /* loaded from: classes9.dex */
    private static abstract class AbstractC37052d implements NetworkRequest.Listener {

        /* renamed from: a */
        private final InterfaceC37054c f97755a;

        private AbstractC37052d(InterfaceC37054c interfaceC37054c) {
            this.f97755a = interfaceC37054c;
        }

        /* renamed from: a */
        abstract Error mo19141a();

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onError(Error error) {
            this.f97755a.onError(error);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onSuccess(Object obj) {
            if (obj != null) {
                this.f97755a.onSuccess(obj);
            } else {
                onError(mo19141a());
            }
        }

        /* synthetic */ AbstractC37052d(InterfaceC37054c interfaceC37054c, C37049a c37049a) {
            this(interfaceC37054c);
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.repository.b$e */
    /* loaded from: classes9.dex */
    private static class C37053e extends NetworkRequest.FileOutputStreamProcessor {
        private C37053e(Context context, File file) {
            super(context, file);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* renamed from: a */
        public Uri transform(File file) {
            return FileUtils.toUri(file);
        }

        /* synthetic */ C37053e(Context context, File file, C37049a c37049a) {
            this(context, file);
        }
    }

    @Override // io.bidmachine.rendering.internal.repository.InterfaceC37047a
    /* renamed from: a */
    public void mo19144a(Context context, String str, InterfaceC37054c interfaceC37054c) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        File fileByUrl = FileUtils.getFileByUrl(applicationContext, str);
        if (fileByUrl == null) {
            interfaceC37054c.onError(new Error("Can't create file for video by url - " + str));
        } else if (!FileUtils.isEmpty(fileByUrl) && (uri = FileUtils.toUri(fileByUrl)) != null) {
            interfaceC37054c.onSuccess(uri);
        } else {
            new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setResponseTransformer(new C37053e(applicationContext, fileByUrl, null)).setListener(new C37050b(interfaceC37054c)).send();
        }
    }

    @Override // io.bidmachine.rendering.internal.repository.InterfaceC37047a
    /* renamed from: b */
    public void mo19143b(Context context, String str, InterfaceC37054c interfaceC37054c) {
        Context applicationContext = context.getApplicationContext();
        File fileByUrl = FileUtils.getFileByUrl(applicationContext, str);
        if (fileByUrl == null) {
            interfaceC37054c.onError(new Error("Can't create file for image by url - " + str));
            return;
        }
        BitmapFactory.Options createDefaultBitmapFactoryOptions = ImageUtils.createDefaultBitmapFactoryOptions();
        createDefaultBitmapFactoryOptions.inJustDecodeBounds = false;
        Bitmap imageByFile = ImageUtils.getImageByFile(fileByUrl, createDefaultBitmapFactoryOptions);
        if (imageByFile != null) {
            interfaceC37054c.onSuccess(imageByFile);
        } else {
            new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setResponseTransformer(new C37051c(applicationContext, fileByUrl, createDefaultBitmapFactoryOptions, null)).setListener(new C37049a(interfaceC37054c)).send();
        }
    }
}
