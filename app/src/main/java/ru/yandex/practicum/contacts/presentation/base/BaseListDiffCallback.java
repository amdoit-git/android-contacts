package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<T> {
    @Override
    public boolean theSameAs(T newItem) {
        return this.hashCode() == newItem.hashCode();
    }

    public boolean areItemsTheSame(T oldItem, T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(T oldItem, T newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(T oldItem, T newItem) {
        return newItem;
    }
}