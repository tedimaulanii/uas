// Generated by view binder compiler. Do not edit!
package com.google.android.fhir.reference.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.fhir.reference.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PatientListItemViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView dob;

  @NonNull
  public final TextView gender;

  @NonNull
  public final TextView idPatientNumber;

  @NonNull
  public final TextView name;

  private PatientListItemViewBinding(@NonNull RelativeLayout rootView, @NonNull TextView dob,
      @NonNull TextView gender, @NonNull TextView idPatientNumber, @NonNull TextView name) {
    this.rootView = rootView;
    this.dob = dob;
    this.gender = gender;
    this.idPatientNumber = idPatientNumber;
    this.name = name;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PatientListItemViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PatientListItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.patient_list_item_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PatientListItemViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dob;
      TextView dob = rootView.findViewById(id);
      if (dob == null) {
        break missingId;
      }

      id = R.id.gender;
      TextView gender = rootView.findViewById(id);
      if (gender == null) {
        break missingId;
      }

      id = R.id.id_patient_number;
      TextView idPatientNumber = rootView.findViewById(id);
      if (idPatientNumber == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      return new PatientListItemViewBinding((RelativeLayout) rootView, dob, gender, idPatientNumber,
          name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}