import "./BtnPag.css";

interface btnpagCont {
  totalPages: number;
  CurrentPage: number;
  setCurrentPage: (page: number) => void;
}

const BtnPag = ({ totalPages, CurrentPage, setCurrentPage }: btnpagCont) => {
  const CambioPag = (page: number) => {
    setCurrentPage(page);
  };
  const buttonsNum = [];

  for (let i = 0; i < totalPages; i++) {
    buttonsNum.push(
      <div
        className={CurrentPage === i ? "btn-active" : "btn"}
        key={i}
        onClick={() => CambioPag(i)}
      >
        {i + 1}
      </div>
    );
  }

  return (
    <div className="main-btn">
      <div className="cont-btn">{buttonsNum}</div>
    </div>
  );
};

export default BtnPag;
