
package android.databinding;
import vn.bolierplate.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case vn.bolierplate.R.layout.simple_place_holder:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/simple_place_holder_0".equals(tag)) {
                            return new vn.bolierplate.databinding.SimplePlaceHolderBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for simple_place_holder is invalid. Received: " + tag);
                }
                case vn.bolierplate.R.layout.item_post:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_post_0".equals(tag)) {
                            return new vn.bolierplate.databinding.ItemPostBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_post is invalid. Received: " + tag);
                }
                case vn.bolierplate.R.layout.activity_main:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_main_0".equals(tag)) {
                            return new vn.bolierplate.databinding.ActivityMainBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
                }
                case vn.bolierplate.R.layout.activity_post_list:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_post_list_0".equals(tag)) {
                            return new vn.bolierplate.databinding.ActivityPostListBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_post_list is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -820104291: {
                if(tag.equals("layout/simple_place_holder_0")) {
                    return vn.bolierplate.R.layout.simple_place_holder;
                }
                break;
            }
            case -1389601896: {
                if(tag.equals("layout/item_post_0")) {
                    return vn.bolierplate.R.layout.item_post;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return vn.bolierplate.R.layout.activity_main;
                }
                break;
            }
            case 593249763: {
                if(tag.equals("layout/activity_post_list_0")) {
                    return vn.bolierplate.R.layout.activity_post_list;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"item"
            ,"listener"
            ,"viewModel"};
    }
}