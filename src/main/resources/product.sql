create table PRODUCT(
    id int primary key,
    name varchar2(50) not null,
    quantity number,
    unit_price number(10,2)
);

INSERT INTO PRODUCT VALUES (id,name,quantity,unit_price);

-- DELETE FROM PRODUCT
-- WHERE ID = 21;

-- DELETE FROM PRODUCT;

select * from PRODUCT;

-- CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 1;
--
-- CREATE OR REPLACE TRIGGER product_trigger
--     BEFORE INSERT ON products
--     FOR EACH ROW
-- BEGIN
-- SELECT product_seq.NEXTVAL INTO :new.id FROM dual;
-- END;
-- /