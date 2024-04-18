import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import PartServices from "../../../services/parts.services";
import PartContainer from "../PartContainer";
import classes from "./PartDetails.module.css";

const PartDetails = ({id}) => {

  console.log("part details id",{id})
  const [partInformation, setPartInformation] = useState([]);
 
  const navigate = useNavigate();
  const { getPartById } = new PartServices();

  const getPartApi = async (id) => {
 

      const partInfo = await getPartById(id);
      console.log("part info data",{partInfo})
      const newParts = (partInfo?.parts || []).map(elem => {
        return { ...elem, createdDate: partInfo?.createdDate}})
      .sort((a, b) => b.id - a.id)?.[0];
      const newPartsData = {...partInfo, parts: [newParts || {}]}
      setPartInformation([newPartsData || {}]);
   
  };
  useEffect(() => {
    getPartApi(id);
  }, [id]);
 console.log("part state",partInformation)
  return (
    <>
        {/* here */}
        <PartContainer>
        <div className={classes.part_details_paragrah}>
          <p className={classes.part_details_heading}>Part Details:-</p>
          <div className={classes.image_part}>
            <div className={classes.image}>
              <img
                src="https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510_1280.jpg"
                alt="part"
              />
            </div>

            {partInformation.map((part, i) => {
              return (
                <>
                  <div key={i} className={classes.part_container}>
                    <div className={classes.master_part}>
                      <div className={classes.masterpart_header}>
                        <p>System:-</p>
                      </div>
                      <p>
                        <strong>Created Date:</strong> {part.createdDate}
                      </p>
                      {part.parts.map((newPart,i)=>{
                        return (
                          <p>
                          <strong>Modified Date:</strong> {newPart.modifiedDate}
                          </p>
                        )
                      })}
                     
                      <p>
                        <strong>Description:</strong> {part.description}
                      </p>

                      <p>
                        <strong>Part Name:</strong> {part.part_name}
                      </p>
                      <p>
                        <strong>Part No.:</strong> {part.part_number}
                      </p>
                    </div>
                    {part.parts.map((childParts, i) => {
                      return (
                        
                        <>
                       
                          <div key={i} className={classes.child_part}>
                            <div className={classes.childpart_header}>
                              <p>Business:-</p>
                            </div>
                            <p>
                              <strong>Supplier Name:</strong>{" "}
                              {childParts.supplier_name}
                            </p>
                            <p>
                              <strong>Material:</strong> {childParts.material}
                            </p>
                            <p>
                              <strong>MPN No.:</strong> {childParts.mpn_number}
                            </p>
                            <p>
                              <strong>Weight:</strong> {childParts.weight}
                            </p>
                            <p>
                              <strong>Dimension:</strong> {childParts.dimension}
                            </p>
                            <p>
                              <strong>Cost:</strong> {childParts.cost}
                            </p>
                            <p>
                              <strong>Lead Date:</strong> {childParts.lead_date}
                            </p>
                            <p>
                              <strong>Quality Matrices:</strong>{" "}
                              {childParts.quality_matrices}
                            </p>
                            <p>
                              <strong>Compliance Information:</strong>{" "}
                              {childParts.compliance_information}
                            </p>
                          </div>
                         
                        </>
                      );
                    })}
                  </div>
                 
                </>
              );
            })}
          </div>
          
        </div>
        </PartContainer>  
             {/* here */}
      {/* </div> */}
    </>
  );
};

export default PartDetails;
