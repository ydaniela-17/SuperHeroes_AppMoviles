// Generated by view binder compiler. Do not edit!
package com.example.superheoresapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.superheoresapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVerDatosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView photoEnviada;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView tvNameEnviado;

  private ActivityVerDatosBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView photoEnviada, @NonNull RatingBar ratingBar,
      @NonNull TextView tvNameEnviado) {
    this.rootView = rootView;
    this.photoEnviada = photoEnviada;
    this.ratingBar = ratingBar;
    this.tvNameEnviado = tvNameEnviado;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerDatosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerDatosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ver_datos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerDatosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.photoEnviada;
      ImageView photoEnviada = rootView.findViewById(id);
      if (photoEnviada == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = rootView.findViewById(id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.tvNameEnviado;
      TextView tvNameEnviado = rootView.findViewById(id);
      if (tvNameEnviado == null) {
        break missingId;
      }

      return new ActivityVerDatosBinding((ConstraintLayout) rootView, photoEnviada, ratingBar,
          tvNameEnviado);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
