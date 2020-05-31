package org.folio.services;

import java.util.Collection;

import org.folio.rest.jaxrs.model.RecordCollection;
import org.folio.rest.jaxrs.model.SourceRecordCollection;
import org.jooq.Condition;
import org.jooq.OrderField;

import io.vertx.core.Future;

public interface LBRecordService extends RecordService {

  /**
   * @deprecated
   */
  @Override
  @Deprecated
  default Future<RecordCollection> getRecords(String query, int offset, int limit, String tenantId) {
    throw new UnsupportedOperationException("Lookup records by CQL is no longer supported");
  }

  Future<RecordCollection> getRecords(Condition condition, Collection<OrderField<?>> orderFields, int offset, int limit, String tenantId);

  /**
   * @deprecated
   */
  @Override
  @Deprecated
  default Future<SourceRecordCollection> getSourceRecords(String query, int offset, int limit, boolean deletedRecords, String tenantId) {
    throw new UnsupportedOperationException("Lookup source records by CQL is no longer supported");
  }

  Future<SourceRecordCollection> getSourceRecords(Condition condition, Collection<OrderField<?>> orderFields, int offset, int limit, String tenantId);

}