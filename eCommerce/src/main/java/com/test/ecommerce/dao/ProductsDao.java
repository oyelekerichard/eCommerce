/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.dao;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.management.Query;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author johnson3yo
 */
@Repository
public class ProductsDao {

//    @PersistenceContext
//    private EntityManager em;

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(ProductsDao.class);

//    public Users findByEmail(String email) {
//        String query = String.format("select * from users where email=?1 ");
//        List<Users> users = em.createNativeQuery(query, Users.class).setParameter(1,
//                email).getResultList();
//        if ((users != null) && !users.isEmpty()) {
//            return users.get(0);
//        } else {
//            return null;
//        }
//    }
//
//    public String getQueueName(int queueId) {
//        List<String> resultList = em.createNativeQuery("select name from queue where id=?1 ").
//                setParameter(1, queueId).
//                getResultList();
//
//        return resultList.isEmpty() ? null : resultList.get(0);
//    }
//
//    public String getWorkOrderExtraData(int ticketId) {
//        List<String> resultList = em.createNativeQuery("select extra_data from work_order where ticket_id=?1 ").
//                setParameter(1, ticketId).
//                getResultList();
//
//        return resultList.isEmpty() ? null : resultList.get(0);
//    }

//    public List<WorkOrder> getWorkOrdersforACustomer(String from, String to) {
//
//        return em.createNativeQuery("select * FROM work_order WHERE create_time BETWEEN CAST(?1 AS DATE) "
//                + "AND DATE_ADD(CAST(?2 AS DATE), INTERVAL 1 day)", WorkOrder.class).
//                setParameter(1, from).setParameter(2, to)
//                .getResultList();
//    }
//
//    public Users getAssigned(int engineerId) {
//        List<Users> resultList = em.createNativeQuery("select * from users where id=(SELECT user_id from engineer where id =?1)", Users.class).
//                setParameter(1, engineerId).
//                getResultList();
//
//        return resultList.isEmpty() ? null : resultList.get(0);

//        List<Users> resultList = em.createNativeQuery("select * from users where is_active=1 and id=?1 and owner_id=?2 limit 1", Users.class).
//                    setParameter(1, userId).setParameter(2, 1).getResultList();
//            return resultList.isEmpty() ? null : resultList.get(0);
    }

//    public Users getUpdatedBy(int userId) {
//        List<Users> resultList = em.createNativeQuery("select * from users where id =?1", Users.class).
//                setParameter(1, userId).
//                getResultList();
//
//        return resultList.isEmpty() ? null : resultList.get(0);
//
//        List<Users> resultList = em.createNativeQuery("select * from users where is_active=1 and id=?1 and owner_id=?2 limit 1", Users.class).
//                    setParameter(1, userId).setParameter(2, 1).getResultList();
//            return resultList.isEmpty() ? null : resultList.get(0);
//    }
//
//    public Integer getAssigneefromWorkOrderUpdate(int ticketId) {
//        List<Integer> resultList = em.createNativeQuery("select updated_by from work_order_update where work_order_id = (select id from work_order where ticket_id=?1) ").
//                setParameter(1, ticketId).
//                getResultList();
//
//        return resultList.isEmpty() ? null : resultList.get(0);
//
//    }

//    public String getWorkOrderAttachment(int ticketId) {
//        logger.info("inside DAO >>> ");//        select filename from work_order_attachments where work_order_id = 25440 LIMIT 1
//        List<String> resultList = em.createNativeQuery("select filename from work_order_attachments WHERE work_order_id =?1 limit 1").
//                setParameter(1, ticketId)
//                .getResultList();
//
//        logger.info("inside DAO >>> "); //+ resultList.isEmpty() ? null : resultList.get(0));
//        return resultList.isEmpty() ? null : resultList.get(0);
////        return resultList.isEmpty() ? null : resultList.get(0);
//
//    }
//}

//    public Integer createWorkOrder(String tk, String businessUnit, String summary, String description, String contactNumber, String city, String address, String tarriff, String queueTypeId, String billingID, String channel, String customername) {
//        Integer retVal;
//        EntityManager em = null;
//        try {
//            em = emf.createEntityManager();
//            EntityTransaction transaction = em.getTransaction();
//            transaction.begin();
//            Query q = em.createNativeQuery("insert into work_order (ticket_id,token,owner_id,queue_id,queue_type_id,summary,description,contact_number,reference_type,reference_type_data,address_line_1,address_line_2,city,state,business_unit,customer_tariff,priority,create_time,channel,customer_name,sent_to_emcc) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)").
//                    setParameter(1, tk).
//                    setParameter(2, RandomStringUtils.randomAlphanumeric(30)).
//                    setParameter(3, 1).setParameter(4, 1).setParameter(5, queueTypeId).setParameter(6, summary).
//                    setParameter(7, description).setParameter(8, contactNumber).setParameter(9, "Billing ID").
//                    setParameter(10, billingID).setParameter(11, address).setParameter(12, "").setParameter(13, city).
//                    setParameter(14, "Lagos").setParameter(15, businessUnit).setParameter(16, tarriff).
//                    setParameter(17, "LOW").setParameter(18, new Date()).setParameter(19, channel).
//                    setParameter(20, customername).setParameter(21, false);
//
//            retVal = q.executeUpdate();
//            transaction.commit();
//            return retVal;
//        } finally {
//            em.close();
//        }
//
//    }