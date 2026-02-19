package com.bellyforex.tradeportea.adapters;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bellyforex.tradeportea.R;
import com.bellyforex.tradeportea.network.module.Symbol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SymbolsAdapter.kt */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter$PostViewHolder;", "()V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/bellyforex/tradeportea/network/module/Symbol;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "differCallback", "com/bellyforex/tradeportea/adapters/SymbolsAdapter$differCallback$1", "Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter$differCallback$1;", "onItemClickListener", "Lkotlin/Function1;", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "listener", "PostViewHolder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class SymbolsAdapter extends RecyclerView.Adapter<PostViewHolder> {
    private final AsyncListDiffer<Symbol> differ;
    private final SymbolsAdapter$differCallback$1 differCallback;
    private Function1<? super Symbol, Unit> onItemClickListener;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bellyforex.tradeportea.adapters.SymbolsAdapter$differCallback$1] */
    public SymbolsAdapter() {
        ?? r0 = new DiffUtil.ItemCallback<Symbol>() { // from class: com.bellyforex.tradeportea.adapters.SymbolsAdapter$differCallback$1
            public boolean areItemsTheSame(Symbol symbol, Symbol symbol2) {
                Intrinsics.checkNotNullParameter(symbol, "oldItem");
                Intrinsics.checkNotNullParameter(symbol2, "newItem");
                return Intrinsics.areEqual(symbol, symbol2);
            }

            public boolean areContentsTheSame(Symbol symbol, Symbol symbol2) {
                Intrinsics.checkNotNullParameter(symbol, "oldItem");
                Intrinsics.checkNotNullParameter(symbol2, "newItem");
                return symbol.getId() == symbol2.getId();
            }
        };
        this.differCallback = r0;
        this.differ = new AsyncListDiffer<>(this, (DiffUtil.ItemCallback) r0);
    }

    /* compiled from: SymbolsAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bellyforex/tradeportea/adapters/SymbolsAdapter;Landroid/view/View;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
    public final class PostViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ SymbolsAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostViewHolder(SymbolsAdapter symbolsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = symbolsAdapter;
        }
    }

    public final AsyncListDiffer<Symbol> getDiffer() {
        return this.differ;
    }

    public PostViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asset_layout, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new PostViewHolder(this, inflate);
    }

    public void onBindViewHolder(PostViewHolder postViewHolder, int i) {
        Intrinsics.checkNotNullParameter(postViewHolder, "holder");
        final Symbol symbol = (Symbol) this.differ.getCurrentList().get(i);
        View view = postViewHolder.itemView;
        ((TextView) view.findViewById(R.id.symbolname)).setText(symbol.getName());
        if (symbol.getLotSize() != null) {
            TextView textView = (TextView) view.findViewById(R.id.lot_txt);
            textView.setText(TextUtils.concat("Lot Size : ", symbol.getLotSize().toString()));
            textView.setVisibility(0);
        } else {
            ((TextView) view.findViewById(R.id.lot_txt)).setVisibility(8);
        }
        if (symbol.getAction() != null) {
            TextView textView2 = (TextView) view.findViewById(R.id.actxt);
            textView2.setText(TextUtils.concat("Action : ", symbol.getAction().toString()));
            textView2.setVisibility(0);
        } else {
            ((TextView) view.findViewById(R.id.actxt)).setVisibility(8);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bellyforex.tradeportea.adapters.SymbolsAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SymbolsAdapter.onBindViewHolder$lambda$6$lambda$5(SymbolsAdapter.this, symbol, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6$lambda$5(SymbolsAdapter symbolsAdapter, Symbol symbol, View view) {
        Intrinsics.checkNotNullParameter(symbolsAdapter, "this$0");
        Function1<? super Symbol, Unit> function1 = symbolsAdapter.onItemClickListener;
        if (function1 != null) {
            Intrinsics.checkNotNull(symbol);
            function1.invoke(symbol);
        }
    }

    public int getItemCount() {
        return this.differ.getCurrentList().size();
    }

    public final void setOnItemClickListener(Function1<? super Symbol, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "listener");
        this.onItemClickListener = function1;
    }
}
