// Generated by data binding compiler. Do not edit!
package com.tiffinia.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.tiffinia.library.R;
import com.tiffinia.library.entities.Address;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAddressBinding extends ViewDataBinding {
  @NonNull
  public final TextInputEditText addressArea;

  @NonNull
  public final TextInputLayout addressAreaTextLayout;

  @NonNull
  public final TextInputEditText addressCity;

  @NonNull
  public final TextInputLayout addressCityTextLayout;

  @NonNull
  public final TextInputEditText addressLine1;

  @NonNull
  public final TextInputLayout addressLine1TextLayout;

  @NonNull
  public final TextInputEditText addressLine2;

  @NonNull
  public final TextInputLayout addressLine2TextLayout;

  @NonNull
  public final TextInputEditText addressPin;

  @NonNull
  public final TextInputLayout addressPinTextLayout;

  @NonNull
  public final TextInputEditText addressState;

  @NonNull
  public final TextInputLayout addressStateTextLayout;

  @NonNull
  public final TextView mapAddress;

  @NonNull
  public final MaterialButton mapButton;

  @NonNull
  public final MaterialButton saveAddress;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected Address mAddress;

  protected ActivityAddressBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputEditText addressArea, TextInputLayout addressAreaTextLayout,
      TextInputEditText addressCity, TextInputLayout addressCityTextLayout,
      TextInputEditText addressLine1, TextInputLayout addressLine1TextLayout,
      TextInputEditText addressLine2, TextInputLayout addressLine2TextLayout,
      TextInputEditText addressPin, TextInputLayout addressPinTextLayout,
      TextInputEditText addressState, TextInputLayout addressStateTextLayout, TextView mapAddress,
      MaterialButton mapButton, MaterialButton saveAddress, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressArea = addressArea;
    this.addressAreaTextLayout = addressAreaTextLayout;
    this.addressCity = addressCity;
    this.addressCityTextLayout = addressCityTextLayout;
    this.addressLine1 = addressLine1;
    this.addressLine1TextLayout = addressLine1TextLayout;
    this.addressLine2 = addressLine2;
    this.addressLine2TextLayout = addressLine2TextLayout;
    this.addressPin = addressPin;
    this.addressPinTextLayout = addressPinTextLayout;
    this.addressState = addressState;
    this.addressStateTextLayout = addressStateTextLayout;
    this.mapAddress = mapAddress;
    this.mapButton = mapButton;
    this.saveAddress = saveAddress;
    this.toolbar = toolbar;
  }

  public abstract void setAddress(@Nullable Address address);

  @Nullable
  public Address getAddress() {
    return mAddress;
  }

  @NonNull
  public static ActivityAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_address, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAddressBinding>inflateInternal(inflater, R.layout.activity_address, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_address, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAddressBinding>inflateInternal(inflater, R.layout.activity_address, null, false, component);
  }

  public static ActivityAddressBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAddressBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAddressBinding)bind(component, view, R.layout.activity_address);
  }
}