package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new mx.com.pruebajobrappi.DataBinderMapperImpl());
  }
}
