package vn.framgia.boilerplate.databinding;
import vn.framgia.boilerplate.R;
import vn.framgia.boilerplate.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cv_add, 1);
        sViewsWithIds.put(R.id.et_username, 2);
        sViewsWithIds.put(R.id.et_password, 3);
        sViewsWithIds.put(R.id.et_repeatpassword, 4);
        sViewsWithIds.put(R.id.bt_go, 5);
        sViewsWithIds.put(R.id.fab, 6);
    }
    // views
    @NonNull
    public final android.widget.Button btGo;
    @NonNull
    public final android.support.v7.widget.CardView cvAdd;
    @NonNull
    public final android.widget.EditText etPassword;
    @NonNull
    public final android.widget.EditText etRepeatpassword;
    @NonNull
    public final android.widget.EditText etUsername;
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    @Nullable
    private vn.framgia.boilerplate.ui.login.RegisterViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRegisterBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.btGo = (android.widget.Button) bindings[5];
        this.cvAdd = (android.support.v7.widget.CardView) bindings[1];
        this.etPassword = (android.widget.EditText) bindings[3];
        this.etRepeatpassword = (android.widget.EditText) bindings[4];
        this.etUsername = (android.widget.EditText) bindings[2];
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[6];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((vn.framgia.boilerplate.ui.login.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable vn.framgia.boilerplate.ui.login.RegisterViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    @Nullable
    public vn.framgia.boilerplate.ui.login.RegisterViewModel getViewModel() {
        return mViewModel;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityRegisterBinding>inflate(inflater, vn.framgia.boilerplate.R.layout.activity_register, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(vn.framgia.boilerplate.R.layout.activity_register, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityRegisterBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_register_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityRegisterBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}