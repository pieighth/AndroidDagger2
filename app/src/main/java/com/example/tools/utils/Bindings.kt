package com.example.tools.utils

import android.os.Build
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.tools.features.movies.list.MovieAdapter
import com.example.tools.models.Movie

@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
    view.adapter = adapter
}

@BindingAdapter("layoutManager")
fun setLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager) {
    view.layoutManager = layoutManager
}

@BindingAdapter("dividerItemDecoration")
fun setDividerItemDecoration(view: RecyclerView, dividerItemDecoration: DividerItemDecoration) {
    view.addItemDecoration(dividerItemDecoration)
}

@BindingAdapter("updateAdapter")
fun updateAdapter(view: RecyclerView, movies: MutableLiveData<MutableList<Movie>>) {

    movies.value?.let {
        val movieAdapter = view.adapter as MovieAdapter
        movieAdapter.setData(it)
    }
}

@BindingAdapter("android:onLayoutChange")
fun setOnLayoutChangeListener(
    view: RecyclerView,
    oldValue: View.OnLayoutChangeListener?,
    newValue: View.OnLayoutChangeListener?
) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        if (oldValue != null) {
            view.removeOnLayoutChangeListener(oldValue)
        }
        if (newValue != null) {
            view.addOnLayoutChangeListener(newValue)
        }
    }
}