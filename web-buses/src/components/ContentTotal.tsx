import Contentbus from "./Contentbus";
import BtnPag from "./BtnPag";
import { useEffect, useState } from "react";
import { Bus, fetchPagedBuses, PagedResponse } from "../Service/BusService";

const ContentTotal = () => {
  const [buses, setBuses] = useState<Bus[]>([]);
  const [currentPage, setCurrentPage] = useState(0);
  const [totalPages, setTotalPages] = useState(0);
  const pageSize = 10;

  useEffect(() => {
    const fetchData = async () => {
      try {
        const pagedResponse: PagedResponse<Bus> = await fetchPagedBuses(
          currentPage,
          pageSize
        );
        setBuses(pagedResponse.content);
        setTotalPages(pagedResponse.totalPages);
      } catch (error) {
        console.error("error al obtener los buses", error);
      }
    };
    fetchData();
  }, [currentPage]);

  
  return (
    <>
      <Contentbus buses={buses}></Contentbus>
      <BtnPag
           totalPages={totalPages} 
           CurrentPage = {currentPage}
           setCurrentPage={setCurrentPage} 
      ></BtnPag>
    </>
  );
};

export default ContentTotal;
