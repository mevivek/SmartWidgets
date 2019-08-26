package com.tiffinia.library.databinding;
import com.tiffinia.library.R;
import com.tiffinia.library.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddressBindingImpl extends ActivityAddressBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.address_line_1_text_layout, 10);
        sViewsWithIds.put(R.id.address_line_2_text_layout, 11);
        sViewsWithIds.put(R.id.address_area_text_layout, 12);
        sViewsWithIds.put(R.id.address_pin_text_layout, 13);
        sViewsWithIds.put(R.id.address_city_text_layout, 14);
        sViewsWithIds.put(R.id.address_state_text_layout, 15);
        sViewsWithIds.put(R.id.map_button, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener addressAreaandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.area
            //         is address.setArea((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressArea);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address
            com.tiffinia.library.entities.Address address = mAddress;
            // address.area
            java.lang.String addressArea = null;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setArea(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressCityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.city
            //         is address.setCity((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressCity);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address
            com.tiffinia.library.entities.Address address = mAddress;
            // address.city
            java.lang.String addressCity = null;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setCity(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressLine1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.addressLine1
            //         is address.setAddressLine1((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressLine1);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address
            com.tiffinia.library.entities.Address address = mAddress;
            // address.addressLine1
            java.lang.String addressAddressLine1 = null;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setAddressLine1(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressLine2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.addressLine2
            //         is address.setAddressLine2((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressLine2);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address
            com.tiffinia.library.entities.Address address = mAddress;
            // address.addressLine2
            java.lang.String addressAddressLine2 = null;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setAddressLine2(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressPinandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.pinCode
            //         is address.setPinCode((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressPin);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address
            com.tiffinia.library.entities.Address address = mAddress;
            // address.pinCode
            java.lang.String addressPinCode = null;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setPinCode(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener addressStateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of address.state
            //         is address.setState((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(addressState);
            // localize variables for thread safety
            // address != null
            boolean addressJavaLangObjectNull = false;
            // address.state
            java.lang.String addressState = null;
            // address
            com.tiffinia.library.entities.Address address = mAddress;



            addressJavaLangObjectNull = (address) != (null);
            if (addressJavaLangObjectNull) {




                address.setState(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            );
        this.addressArea.setTag(null);
        this.addressCity.setTag(null);
        this.addressLine1.setTag(null);
        this.addressLine2.setTag(null);
        this.addressPin.setTag(null);
        this.addressState.setTag(null);
        this.mapAddress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.saveAddress.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.address == variableId) {
            setAddress((com.tiffinia.library.entities.Address) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddress(@Nullable com.tiffinia.library.entities.Address Address) {
        this.mAddress = Address;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.address);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String addressJavaLangObjectNullJavaLangStringAddAddressJavaLangStringEditAddress = null;
        boolean addressJavaLangObjectNull = false;
        java.lang.String addressPinCode = null;
        com.tiffinia.library.entities.Address address = mAddress;
        java.lang.String AddressArea1 = null;
        java.lang.String addressGetStringSingleLine = null;
        boolean addressJavaLangObjectNullBooleanFalseBooleanTrue = false;
        java.lang.String AddressCity1 = null;
        java.lang.String addressJavaLangObjectNullMapAddressAndroidStringChooseALocationOnMapAddressGetStringSingleLine = null;
        java.lang.String addressAddressLine1 = null;
        java.lang.String addressAddressLine2 = null;
        java.lang.String AddressState1 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read address == null
                addressJavaLangObjectNull = (address) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(addressJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }
                if (address != null) {
                    // read address.pinCode
                    addressPinCode = address.getPinCode();
                    // read address.area
                    AddressArea1 = address.getArea();
                    // read address.city
                    AddressCity1 = address.getCity();
                    // read address.addressLine1
                    addressAddressLine1 = address.getAddressLine1();
                    // read address.addressLine2
                    addressAddressLine2 = address.getAddressLine2();
                    // read address.state
                    AddressState1 = address.getState();
                }


                // read address == null ? "Add Address" : "Edit Address"
                addressJavaLangObjectNullJavaLangStringAddAddressJavaLangStringEditAddress = ((addressJavaLangObjectNull) ? ("Add Address") : ("Edit Address"));
                // read address == null ? false : true
                addressJavaLangObjectNullBooleanFalseBooleanTrue = ((addressJavaLangObjectNull) ? (false) : (true));
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (address != null) {
                    // read address.getStringSingleLine()
                    addressGetStringSingleLine = address.getStringSingleLine();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read address == null ? @android:string/choose_a_location_on_map : address.getStringSingleLine()
                addressJavaLangObjectNullMapAddressAndroidStringChooseALocationOnMapAddressGetStringSingleLine = ((addressJavaLangObjectNull) ? (mapAddress.getResources().getString(R.string.choose_a_location_on_map)) : (addressGetStringSingleLine));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressArea, AddressArea1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressCity, AddressCity1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressLine1, addressAddressLine1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressLine2, addressAddressLine2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressPin, addressPinCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.addressState, AddressState1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mapAddress, addressJavaLangObjectNullMapAddressAndroidStringChooseALocationOnMapAddressGetStringSingleLine);
            this.saveAddress.setEnabled(addressJavaLangObjectNullBooleanFalseBooleanTrue);
            this.toolbar.setTitle(addressJavaLangObjectNullJavaLangStringAddAddressJavaLangStringEditAddress);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressArea, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressAreaandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressCity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressCityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressLine1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressLine1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressLine2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressLine2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressPin, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressPinandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.addressState, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, addressStateandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): address
        flag 1 (0x2L): null
        flag 2 (0x3L): address == null ? "Add Address" : "Edit Address"
        flag 3 (0x4L): address == null ? "Add Address" : "Edit Address"
        flag 4 (0x5L): address == null ? false : true
        flag 5 (0x6L): address == null ? false : true
        flag 6 (0x7L): address == null ? @android:string/choose_a_location_on_map : address.getStringSingleLine()
        flag 7 (0x8L): address == null ? @android:string/choose_a_location_on_map : address.getStringSingleLine()
    flag mapping end*/
    //end
}