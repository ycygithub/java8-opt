package opt;

import java.lang.annotation.Repeatable;

/**
 * Created by Dell 1 on 15-5-13.
 */
public class RepeatAnnotationNew {

    @Repeatable( Authorities.class )
    public @interface Authority {
        String role();
    }

    public @interface Authorities {
        Authority[] value();
    }

    public class RepeatAnnotationUseNewVersion {

        @Authority(role="Admin")
        @Authority(role="Manager")
        public void doSomeThing(){ }
    }

}
