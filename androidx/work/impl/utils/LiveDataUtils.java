package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1 */
    /* loaded from: classes2.dex */
    class C33051<In> implements Observer<In> {
        Out mCurrentOutput = null;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ Function val$mappingMethod;
        final /* synthetic */ MediatorLiveData val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        C33051(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.val$workTaskExecutor = taskExecutor;
            this.val$lock = obj;
            this.val$mappingMethod = function;
            this.val$outputLiveData = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable final In in) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C33051.this.val$lock) {
                        ?? apply = C33051.this.val$mappingMethod.apply(in);
                        C33051 c33051 = C33051.this;
                        Out out = c33051.mCurrentOutput;
                        if (out == 0 && apply != 0) {
                            c33051.mCurrentOutput = apply;
                            c33051.val$outputLiveData.postValue(apply);
                        } else if (out != 0 && !out.equals(apply)) {
                            C33051 c330512 = C33051.this;
                            c330512.mCurrentOutput = apply;
                            c330512.val$outputLiveData.postValue(apply);
                        }
                    }
                }
            });
        }
    }

    private LiveDataUtils() {
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new C33051(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
