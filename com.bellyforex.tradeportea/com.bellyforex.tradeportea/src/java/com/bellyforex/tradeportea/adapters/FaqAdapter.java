package com.bellyforex.tradeportea.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.module.Faqs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FaqAdapter.kt */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\u001c\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/bellyforex/tradeportea/adapters/FaqAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bellyforex/tradeportea/adapters/FaqAdapter$PostViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/bellyforex/tradeportea/network/module/Faqs;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "com/bellyforex/tradeportea/adapters/FaqAdapter$differCallback$1", "Lcom/bellyforex/tradeportea/adapters/FaqAdapter$differCallback$1;", "onItemClickListener", "Lkotlin/Function1;", "", "selectedPos", "", "getSelectedPos", "()Ljava/lang/Integer;", "setSelectedPos", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "PostViewHolder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class FaqAdapter extends RecyclerView.Adapter<PostViewHolder> {
    private final AsyncListDiffer<Faqs> differ;
    private final FaqAdapter$differCallback$1 differCallback;
    private Function1<? super Faqs, Unit> onItemClickListener;
    private Integer selectedPos;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bellyforex.tradeportea.adapters.FaqAdapter$differCallback$1] */
    public FaqAdapter() {
        ?? r0 = new DiffUtil.ItemCallback<Faqs>() { // from class: com.bellyforex.tradeportea.adapters.FaqAdapter$differCallback$1
            public boolean areItemsTheSame(Faqs faqs, Faqs faqs2) {
                Intrinsics.checkNotNullParameter(faqs, "oldItem");
                Intrinsics.checkNotNullParameter(faqs2, "newItem");
                return Intrinsics.areEqual(faqs, faqs2);
            }

            public boolean areContentsTheSame(Faqs faqs, Faqs faqs2) {
                Intrinsics.checkNotNullParameter(faqs, "oldItem");
                Intrinsics.checkNotNullParameter(faqs2, "newItem");
                return Intrinsics.areEqual(faqs, faqs2);
            }
        };
        this.differCallback = r0;
        this.differ = new AsyncListDiffer<>(this, (DiffUtil.ItemCallback) r0);
    }

    /* compiled from: FaqAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bellyforex/tradeportea/adapters/FaqAdapter$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bellyforex/tradeportea/adapters/FaqAdapter;Landroid/view/View;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public final class PostViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ FaqAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostViewHolder(FaqAdapter faqAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = faqAdapter;
        }
    }

    public final AsyncListDiffer<Faqs> getDiffer() {
        return this.differ;
    }

    public PostViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.faq_layout, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PostViewHolder(this, inflate);
    }

    public void onBindViewHolder(PostViewHolder postViewHolder, final int i) {
        Intrinsics.checkNotNullParameter(postViewHolder, "holder");
        final Faqs faqs = (Faqs) this.differ.getCurrentList().get(i);
        View view = postViewHolder.itemView;
        ((TextView) view.findViewById(R.id.title)).setText(faqs.getTitle());
        ((TextView) view.findViewById(R.id.body)).setText(faqs.getBody());
        boolean selected = faqs.getSelected();
        if (selected) {
            ((TextView) view.findViewById(R.id.body)).setVisibility(0);
            ((ImageView) view.findViewById(R.id.down_arrow)).setVisibility(8);
            ((ImageView) view.findViewById(R.id.up_arrow)).setVisibility(0);
        } else if (!selected) {
            ((TextView) view.findViewById(R.id.body)).setVisibility(8);
            ((ImageView) view.findViewById(R.id.down_arrow)).setVisibility(0);
            ((ImageView) view.findViewById(R.id.up_arrow)).setVisibility(8);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.adapters.FaqAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaqAdapter.onBindViewHolder$lambda$2$lambda$1(FaqAdapter.this, i, faqs, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2$lambda$1(FaqAdapter faqAdapter, int i, Faqs faqs, View view) {
        Intrinsics.checkNotNullParameter(faqAdapter, "this$0");
        faqAdapter.selectedPos = Integer.valueOf(i);
        Function1<? super Faqs, Unit> function1 = faqAdapter.onItemClickListener;
        if (function1 != null) {
            Intrinsics.checkNotNull(faqs);
            function1.invoke(faqs);
        }
    }

    public int getItemCount() {
        return this.differ.getCurrentList().size();
    }

    public final void setOnItemClickListener(Function1<? super Faqs, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "listener");
        this.onItemClickListener = function1;
    }

    public final Integer getSelectedPos() {
        return this.selectedPos;
    }

    public final void setSelectedPos(Integer num) {
        this.selectedPos = num;
    }
}
