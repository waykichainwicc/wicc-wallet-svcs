package com.waykichain.chain.commons.biz.repository.mysql

import com.waykichain.chain.biz.domain.BcWiccSendTransactionLog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QueryDslPredicateExecutor

interface BcWiccSendTransactionLogRepository : JpaRepository<BcWiccSendTransactionLog, Long>,
    QueryDslPredicateExecutor<BcWiccSendTransactionLog>
