package mx.com.pruebajobrappi.databinding;
import mx.com.pruebajobrappi.R;
import mx.com.pruebajobrappi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPopularMovieBindingImpl extends ItemPopularMovieBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivMoviePoster, 3);
        sViewsWithIds.put(R.id.ivMovieFavoriteState, 4);
        sViewsWithIds.put(R.id.linearLayout, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPopularMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemPopularMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvMovieTitle.setTag(null);
        this.tvTotalPointsItem.setTag(null);
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
        if (BR.movie == variableId) {
            setMovie((mx.com.pruebajobrappi.data.models.Movie) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable mx.com.pruebajobrappi.data.models.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
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
        java.lang.String movieVoteAverageJavaLangString = null;
        java.lang.String movieVoteAverageJavaLangStringMovieVoteCount = null;
        java.lang.String movieTitle = null;
        long movieVoteCount = 0;
        mx.com.pruebajobrappi.data.models.Movie movie = mMovie;
        double movieVoteAverage = 0.0;
        java.lang.String movieVoteAverageJavaLangStringMovieVoteCountJavaLangStringVotes = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movie != null) {
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.voteCount
                    movieVoteCount = movie.getVoteCount();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                }


                // read (movie.voteAverage) + ("(")
                movieVoteAverageJavaLangString = (movieVoteAverage) + ("(");


                // read ((movie.voteAverage) + ("(")) + (movie.voteCount)
                movieVoteAverageJavaLangStringMovieVoteCount = (movieVoteAverageJavaLangString) + (movieVoteCount);


                // read (((movie.voteAverage) + ("(")) + (movie.voteCount)) + ("votes )")
                movieVoteAverageJavaLangStringMovieVoteCountJavaLangStringVotes = (movieVoteAverageJavaLangStringMovieVoteCount) + ("votes )");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMovieTitle, movieTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalPointsItem, movieVoteAverageJavaLangStringMovieVoteCountJavaLangStringVotes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}