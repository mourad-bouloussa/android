<?xml version="1.0" encoding="utf-8"?>
<android.support.v7.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_marginBottom="4dp"
    app:cardCornerRadius="4dp">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="4dp">

        <ImageView
            android:id="@+id/image_view"
            android:layout_width="50dp"
            android:layout_height="50dp"
            android:padding="2dp" />

        <TextView
            android:id="@+id/text_view1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_toEndOf="@+id/image_view"
            android:text="Line 1"
            android:textColor="@android:color/black"
            android:textSize="20sp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/text_view2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@+id/text_view1"
            android:layout_marginStart="8dp"
            android:layout_toEndOf="@+id/image_view"
            android:text="Line 2"
            android:textSize="15sp" />

    </RelativeLayout>

</android.support.v7.widget.CardView>