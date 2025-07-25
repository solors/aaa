package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class Request {
    private static final long TOO_LONG_LOG = TimeUnit.SECONDS.toNanos(5);
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;

    /* renamed from: id */
    int f73046id;
    int networkPolicy;
    public final boolean onlyScaleDown;
    public final Picasso.Priority priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    long started;
    public final int targetHeight;
    public final int targetWidth;
    public final List<Transformation> transformations;
    public final Uri uri;

    /* loaded from: classes7.dex */
    public static final class Builder {
        private boolean centerCrop;
        private int centerCropGravity;
        private boolean centerInside;
        private Bitmap.Config config;
        private boolean hasRotationPivot;
        private boolean onlyScaleDown;
        private Picasso.Priority priority;
        private boolean purgeable;
        private int resourceId;
        private float rotationDegrees;
        private float rotationPivotX;
        private float rotationPivotY;
        private String stableKey;
        private int targetHeight;
        private int targetWidth;
        private List<Transformation> transformations;
        private Uri uri;

        public Request build() {
            boolean z = this.centerInside;
            if (z && this.centerCrop) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.centerCrop && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z && this.targetWidth == 0 && this.targetHeight == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.priority == null) {
                this.priority = Picasso.Priority.NORMAL;
            }
            return new Request(this.uri, this.resourceId, this.stableKey, this.transformations, this.targetWidth, this.targetHeight, this.centerCrop, this.centerInside, this.centerCropGravity, this.onlyScaleDown, this.rotationDegrees, this.rotationPivotX, this.rotationPivotY, this.hasRotationPivot, this.purgeable, this.config, this.priority);
        }

        public Builder centerCrop() {
            return centerCrop(17);
        }

        public Builder centerInside() {
            if (!this.centerCrop) {
                this.centerInside = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        public Builder clearCenterCrop() {
            this.centerCrop = false;
            this.centerCropGravity = 17;
            return this;
        }

        public Builder clearCenterInside() {
            this.centerInside = false;
            return this;
        }

        public Builder clearOnlyScaleDown() {
            this.onlyScaleDown = false;
            return this;
        }

        public Builder clearResize() {
            this.targetWidth = 0;
            this.targetHeight = 0;
            this.centerCrop = false;
            this.centerInside = false;
            return this;
        }

        public Builder clearRotation() {
            this.rotationDegrees = 0.0f;
            this.rotationPivotX = 0.0f;
            this.rotationPivotY = 0.0f;
            this.hasRotationPivot = false;
            return this;
        }

        public Builder config(@NonNull Bitmap.Config config) {
            if (config != null) {
                this.config = config;
                return this;
            }
            throw new IllegalArgumentException("config == null");
        }

        public boolean hasImage() {
            if (this.uri == null && this.resourceId == 0) {
                return false;
            }
            return true;
        }

        public boolean hasPriority() {
            if (this.priority != null) {
                return true;
            }
            return false;
        }

        public boolean hasSize() {
            if (this.targetWidth == 0 && this.targetHeight == 0) {
                return false;
            }
            return true;
        }

        public Builder onlyScaleDown() {
            if (this.targetHeight == 0 && this.targetWidth == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.onlyScaleDown = true;
            return this;
        }

        public Builder priority(@NonNull Picasso.Priority priority) {
            if (priority != null) {
                if (this.priority == null) {
                    this.priority = priority;
                    return this;
                }
                throw new IllegalStateException("Priority already set.");
            }
            throw new IllegalArgumentException("Priority invalid.");
        }

        public Builder purgeable() {
            this.purgeable = true;
            return this;
        }

        public Builder resize(@InterfaceC0152Px int i, @InterfaceC0152Px int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    if (i2 == 0 && i == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.targetWidth = i;
                    this.targetHeight = i2;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public Builder rotate(float f) {
            this.rotationDegrees = f;
            return this;
        }

        public Builder setResourceId(@DrawableRes int i) {
            if (i != 0) {
                this.resourceId = i;
                this.uri = null;
                return this;
            }
            throw new IllegalArgumentException("Image resource ID may not be 0.");
        }

        public Builder setUri(@NonNull Uri uri) {
            if (uri != null) {
                this.uri = uri;
                this.resourceId = 0;
                return this;
            }
            throw new IllegalArgumentException("Image URI may not be null.");
        }

        public Builder stableKey(@Nullable String str) {
            this.stableKey = str;
            return this;
        }

        public Builder transform(@NonNull Transformation transformation) {
            if (transformation != null) {
                if (transformation.key() != null) {
                    if (this.transformations == null) {
                        this.transformations = new ArrayList(2);
                    }
                    this.transformations.add(transformation);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }

        public Builder(@NonNull Uri uri) {
            setUri(uri);
        }

        public Builder centerCrop(int i) {
            if (!this.centerInside) {
                this.centerCrop = true;
                this.centerCropGravity = i;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public Builder rotate(float f, float f2, float f3) {
            this.rotationDegrees = f;
            this.rotationPivotX = f2;
            this.rotationPivotY = f3;
            this.hasRotationPivot = true;
            return this;
        }

        public Builder(@DrawableRes int i) {
            setResourceId(i);
        }

        public Builder(Uri uri, int i, Bitmap.Config config) {
            this.uri = uri;
            this.resourceId = i;
            this.config = config;
        }

        public Builder transform(@NonNull List<? extends Transformation> list) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    transform(list.get(i));
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }

        private Builder(Request request) {
            this.uri = request.uri;
            this.resourceId = request.resourceId;
            this.stableKey = request.stableKey;
            this.targetWidth = request.targetWidth;
            this.targetHeight = request.targetHeight;
            this.centerCrop = request.centerCrop;
            this.centerInside = request.centerInside;
            this.centerCropGravity = request.centerCropGravity;
            this.rotationDegrees = request.rotationDegrees;
            this.rotationPivotX = request.rotationPivotX;
            this.rotationPivotY = request.rotationPivotY;
            this.hasRotationPivot = request.hasRotationPivot;
            this.purgeable = request.purgeable;
            this.onlyScaleDown = request.onlyScaleDown;
            if (request.transformations != null) {
                this.transformations = new ArrayList(request.transformations);
            }
            this.config = request.config;
            this.priority = request.priority;
        }
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public String getName() {
        Uri uri = this.uri;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.resourceId);
    }

    public boolean hasCustomTransformations() {
        if (this.transformations != null) {
            return true;
        }
        return false;
    }

    public boolean hasSize() {
        if (this.targetWidth == 0 && this.targetHeight == 0) {
            return false;
        }
        return true;
    }

    public String logId() {
        long nanoTime = System.nanoTime() - this.started;
        if (nanoTime > TOO_LONG_LOG) {
            return plainId() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return plainId() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public boolean needsMatrixTransform() {
        if (!hasSize() && this.rotationDegrees == 0.0f) {
            return false;
        }
        return true;
    }

    public boolean needsTransformation() {
        if (!needsMatrixTransform() && !hasCustomTransformations()) {
            return false;
        }
        return true;
    }

    public String plainId() {
        return "[R" + this.f73046id + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i = this.resourceId;
        if (i > 0) {
            sb2.append(i);
        } else {
            sb2.append(this.uri);
        }
        List<Transformation> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            for (Transformation transformation : this.transformations) {
                sb2.append(' ');
                sb2.append(transformation.key());
            }
        }
        if (this.stableKey != null) {
            sb2.append(" stableKey(");
            sb2.append(this.stableKey);
            sb2.append(')');
        }
        if (this.targetWidth > 0) {
            sb2.append(" resize(");
            sb2.append(this.targetWidth);
            sb2.append(',');
            sb2.append(this.targetHeight);
            sb2.append(')');
        }
        if (this.centerCrop) {
            sb2.append(" centerCrop");
        }
        if (this.centerInside) {
            sb2.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb2.append(" @ ");
                sb2.append(this.rotationPivotX);
                sb2.append(',');
                sb2.append(this.rotationPivotY);
            }
            sb2.append(')');
        }
        if (this.purgeable) {
            sb2.append(" purgeable");
        }
        if (this.config != null) {
            sb2.append(' ');
            sb2.append(this.config);
        }
        sb2.append('}');
        return sb2.toString();
    }

    private Request(Uri uri, int i, String str, List<Transformation> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority) {
        this.uri = uri;
        this.resourceId = i;
        this.stableKey = str;
        if (list == null) {
            this.transformations = null;
        } else {
            this.transformations = Collections.unmodifiableList(list);
        }
        this.targetWidth = i2;
        this.targetHeight = i3;
        this.centerCrop = z;
        this.centerInside = z2;
        this.centerCropGravity = i4;
        this.onlyScaleDown = z3;
        this.rotationDegrees = f;
        this.rotationPivotX = f2;
        this.rotationPivotY = f3;
        this.hasRotationPivot = z4;
        this.purgeable = z5;
        this.config = config;
        this.priority = priority;
    }
}
