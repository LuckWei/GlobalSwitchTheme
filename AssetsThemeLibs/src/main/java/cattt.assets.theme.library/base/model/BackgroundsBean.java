package cattt.assets.theme.library.base.model;

import java.io.File;

public class BackgroundsBean {
    private String id;
    private File drawable;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public File getDrawable() {
        return drawable;
    }

    public void setDrawable(final File drawable) {
        this.drawable = drawable;
    }
}
