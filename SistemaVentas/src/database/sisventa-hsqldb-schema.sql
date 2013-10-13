--
--    Copyright 2010-2013 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--




-- -----------------------------------------------------
-- Table `mydb`.`model`
-- -----------------------------------------------------


CREATE  TABLE  model (
  id_model INT NOT NULL ,
  name_model VARCHAR(35) NULL ,
  description_model VARCHAR(60) NULL ,
  constraint pk_model PRIMARY KEY (id_model));


-- -----------------------------------------------------
-- Table design
-- -----------------------------------------------------


CREATE  TABLE design (
  id_design INT NOT NULL ,
  name_design VARCHAR(45) NULL ,
  description_design VARCHAR(60) NULL ,
  constraint pk_design PRIMARY KEY (id_design) 
  );


-- -----------------------------------------------------
-- Table product
-- -----------------------------------------------------


CREATE  TABLE product (
  id_product INT NOT NULL ,
  name_product VARCHAR(45) NULL ,
  description_product VARCHAR(60) NULL ,
  model_id INT NOT NULL ,
  design_id INT NOT NULL ,
  constraint pk_product PRIMARY KEY (id_product) ,
  CONSTRAINT fk_product_model
    FOREIGN KEY (model_id)
    REFERENCES model (id_model),
  CONSTRAINT fk_product_design
    FOREIGN KEY (design_id )
    REFERENCES design (id_design)
    );






