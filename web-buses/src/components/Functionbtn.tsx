import { useEffect, useState } from "react";
import "./Functionbtn.css";
import { Bus, fetchBusbyId } from "../Service/BusService";

const Functionbtn = () => {
  const [bus, setBus] = useState<Bus | null>(null);
  const [id, setId] = useState("");

  const Clickbtn = async () => {
    const busData = await fetchBusbyId(parseInt(id));
    if (busData) {
      setBus(busData);
    } else {
      setBus(null);   
    }
  };

  const BtnClose =() =>{
    setBus(null)
  }

  const ChangeInput = (e: React.ChangeEvent<HTMLInputElement>) => {
    const value = e.currentTarget.value;
    if (parseInt(value) > 0) {
      setId(value);
    }
  };

  return (
    <>
       {bus ? (
        <div className="main-busid">
          <div className="databus">
            <div className="buscontent">
              <p>
                <strong>Id: </strong>{bus.idBus}
              </p>
              <p>
                <strong>Numero de Bus: </strong>{bus.numero_bus}
              </p>
              <p>
                <strong>Placa: </strong>{bus.placa}
              </p>
              <p>
                <strong>Fecha de Creacion: </strong>{bus.fecha_creacion}
              </p>
              <p>
                <strong>Caracteristicas: </strong>{bus.caracteristicas}
              </p>
              <p>
                <strong>Marca Id: </strong>{bus.idMarca_bus}
              </p>
              <p>
                <strong>Actividad: </strong>
                {bus.actividad ? "Activo" : "Inactivo"}
              </p>
              <button onClick={BtnClose}>Cerrar</button>
            </div>
          </div>
        </div>
      ):(
        null
      )}

      <div className="main-function">
        <input type="number" value={id} onChange={ChangeInput} min="1" />
        <button onClick={Clickbtn}>Buscar Por Id</button>
      </div>
    </>
  );
};

export default Functionbtn;
