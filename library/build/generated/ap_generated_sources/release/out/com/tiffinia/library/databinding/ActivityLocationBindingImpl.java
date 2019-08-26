package com.tiffinia.library.databinding;
import com.tiffinia.library.R;
import com.tiffinia.library.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLocationBindingImpl extends ActivityLocationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.autocomplete, 3);
        sViewsWithIds.put(R.id.current_location, 4);
        sViewsWithIds.put(R.id.marker, 5);
        sViewsWithIds.put(R.id.cancel_map, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLocationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityLocationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.popupMapAddress.setTag(null);
        this.setMap.setTag(null);
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
        java.lang.String addressGetStringSingleLine = null;
        boolean addressJavaLangObjectNull = false;
        boolean addressJavaLangObjectNullBooleanFalseBooleanTrue = false;
        com.tiffinia.library.entities.Address address = mAddress;
        java.lang.String addressJavaLangObjectNullJavaLangStringAddressNotFoundAddressGetStringSingleLine = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read address == null
                addressJavaLangObjectNull = (address) == (null);
            if((dirtyFlags & 0x3L) != 0) {
                if(addressJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read address == null ? false : true
                addressJavaLangObjectNullBooleanFalseBooleanTrue = ((addressJavaLangObjectNull) ? (false) : (true));
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (address != null) {
                    // read address.getStringSingleLine()
                    addressGetStringSingleLine = address.getStringSingleLine();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read address == null ? "Address not found" : address.getStringSingleLine()
                addressJavaLangObjectNullJavaLangStringAddressNotFoundAddressGetStringSingleLine = ((addressJavaLangObjectNull) ? ("Address not found") : (addressGetStringSingleLine));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.popupMapAddress, addressJavaLangObjectNullJavaLangStringAddressNotFoundAddressGetStringSingleLine);
            this.setMap.setEnabled(addressJavaLangObjectNullBooleanFalseBooleanTrue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): address
        flag 1 (0x2L): null
        flag 2 (0x3L): address == null ? false : true
        flag 3 (0x4L): address == null ? false : true
        flag 4 (0x5L): address == null ? "Address not found" : address.getStringSingleLine()
        flag 5 (0x6L): address == null ? "Address not found" : address.getStringSingleLine()
    flag mapping end*/
    //end
}